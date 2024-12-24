#include <stdio.h>
int main()
{
    // 1-Write a C program to check whether two given strings are anagrams of each other ?
    // char str[20] = "listen";
    // char str2[20] = "silent";
    // int is_listen = 0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     for (int j = i + 1; str[j] != '\0'; j++)
    //     { // Start from the next character
    //         if (str[i] > str[j])
    //         { // Swap if out of order
    //             char temp = str[i];
    //             str[i] = str[j];
    //             str[j] = temp;
    //         }
    //     }
    // }
    // // printf("\n%s", str);
    // for (int i = 0; str2[i] != '\0'; i++)
    // {
    //     for (int j = i + 1; str2[j] != '\0'; j++)
    //     { // Start from the next character
    //         if (str2[i] > str2[j])
    //         { // Swap if out of order
    //             char temp = str2[i];
    //             str2[i] = str2[j];
    //             str2[j] = temp;
    //         }
    //     }
    // }
    // // printf("\n%s", str2);
    // for (int i = 0; i < str[i] != '\0'; i++)
    // {
    //     if (str[i] != str2[i])
    //     {
    //         is_listen = 1;
    //         break;
    //     }
    // }
    // if (is_listen){
    //     printf("The strings are not anagrams of each other.\n");
    // }
    // else{
    //     printf("The strings are anagrams of each other.\n");
    // }

    // 2-Write a C program to calculate and display the frequency of each character present in a given string ?
    //  char str[20] = "aaaaa";
    //  int freq[256] = {0};
    //  int freq2[256] = {0};
    //  for (int i = 0; str[i] != '\0'; i++) {
    //      freq[(int)str[i]]++;
    //  }
    //  printf("Character frequencies:\n");
    //  for (int i = 0; str[i] != '\0'; i++) {
    //      int st = (int)str[i];
    //      freq2[(int)str[i]]++;
    //      if (freq2[st]  == 1) {
    //          printf("The frequency of %c is %d\n", str[i], freq[st]);
    //      }
    //  }

    // 3-Write a C program to swap the first and last characters of a given string and display the result?
    char str[20] = "hello";
    char temp;
    int sizeOfString = 0;
    for (int i = 0; str[i] != '\0'; i++)
    {
        sizeOfString++;
    }
    temp = str[0];
    str[0] = str[sizeOfString - 1];
    str[sizeOfString - 1] = temp;
    printf("Swapped string: %s\n", str);

    return 0;
}