#include<stdio.h>
int main(){
    //1- Reverse the String
    // char str[20] = "kanha12";
    // int count = 0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     count++;
    // }
    // printf("Reverse of the string :");
    // for(int i = count - 1; i >= 0; i--){
    //     printf("%c", str[i]);
    // }

    //2-Count the number of characters in the string
    // char str[20] = "kanha12";
    // int count = 0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <='Z'))
    //     {
    //        count++;
    //     }
        
    // }
    // printf("Number of the character in given string is %d",count);
    

    //3- Count the vowel,consonta and digit 
    // char str[20] = "kanha12@";
    // int vowelCount = 0, consonantCount = 0, digitCount = 0,special=0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     if (str[i] == 'a' ||str[i] == 'i' ||str[i] == 'o' ||str[i] == 'u' ||str[i] == 'e' ||str[i] == 'A' ||str[i] == 'E' ||str[i] == 'I' ||str[i] == 'O' ||str[i] == 'U')
    //     {
    //         vowelCount++;
    //     } else if (str[i] >= 48 && str[i] <= 57)
    //     {
    //         digitCount++;   
    //     } else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <='Z'))
    //     {
    //         consonantCount++;
    //     }
    //     else{
    //         special++;
    //     }
    // }
    // printf("Number of vowels in the string is %d\n", vowelCount);
    // printf("Number of digit in the string is %d\n", digitCount);
    // printf("Number of consonant in the string is %d\n", consonantCount);
    // printf("Number of special character in the string is %d\n", special);


    //4- String containing a vowel or not 
    // char str[20] = "k123";
    // int isVowel = 0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     if (str[i] == 'a' ||str[i] == 'i' ||str[i] == 'o' ||str[i] == 'u' ||str[i] == 'e' ||str[i] == 'A' ||str[i] == 'E' ||str[i] == 'I' ||str[i] == 'O' ||str[i] == 'U')
    //     {
    //         isVowel = 1;
    //     }
    // }
    // if (isVowel)
    // {
    //     printf("The String Containing a Vowel");
    // }else{
    //     printf("The String not Containing a Vowel");
    // }
    
    
    //5-Sort the string
    // char str[20] = "abdcw";
    //  int count = 0;
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //     count++;
    // }
    // for (int i = 0; str[i] != '\0'; i++)
    // {
    //    for (int j = 0; str[j] != '\0'; j++)
    //    {
    //     if (str[i] > str[j])
    //     {
    //         char temp = str[i];
    //         str[i] = str[j];
    //         str[j] = temp;
    //     }
    //    }
    // }
    // printf("Sorted string is : %s\n", str);


    // 6- Check the String is palindrom or not
    char str[20] = "madam";
    int isPalindrome = 1;
    int count = 0;
    for (int i = 0; str[i]!= '\0'; i++)
    {
        count++;
    }
    for (int i = 0; i < count/2; i++)
    {
        if (str[i]!= str[count - i - 1])
        {
            isPalindrome = 0;
        }
    }
    if (isPalindrome)
    {
        printf("The String is Palindrom");
    } else{
        printf("The String is not Palindrom");
    }



    return 0;
}