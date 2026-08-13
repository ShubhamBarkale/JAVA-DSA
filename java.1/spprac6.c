#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {

    pid_t pid;

    printf("Parent Process ID: %d\n", getpid());

    // Fork system call
    pid = fork();

    if (pid < 0) {
        printf("Fork failed!\n");
        exit(1);
    }
    else if (pid == 0) {

        // Child process
        printf("\n--- Child Process ---\n");
        printf("Child PID: %d\n", getpid());

        // Exec system call
        printf("Executing 'ls' using exec...\n");
        execl("/bin/ls", "ls", NULL);

        // If exec fails
        printf("Exec failed!\n");
        exit(1);
    }
    else {

        // Parent process
        printf("\n--- Parent Process ---\n");
        printf("Waiting for child to finish...\n");

        // Wait system call
        wait(NULL);

        printf("Child process completed.\n");

        // ps command using system call
        printf("\nCurrent Processes (ps):\n");
        system("ps");
    }

    return 0;
}