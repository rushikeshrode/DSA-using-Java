package cc.OOPs;
// String : are mutable, we can't change them. If we change it, its actually create a temporary obj of it.
// Stringbuilder : It's a string it is mutable, We can change it, modify it & store it in another heap(even it contains same value)
public class StringBuilderSB {
    public static void main(String[] args) {

// String

        String name1 = "RUSHIKESH RODE";
        String name2 = "RUSHIKESH RODE";

        System.out.println(name1.toLowerCase());   // we change it, but
        System.out.println(name1);                 // its not changing original object

        System.out.println(name1 == name2);       // #1


// what if we want to create another obj of name2(hving diff memory address)
// Stringbuilder

        StringBuilder name3 = new StringBuilder("Rushikesh Rode");
        StringBuilder name4 = new StringBuilder("Rushikesh Rode");

        System.out.println(name3 == name4);     // false #2


    }
}


/*  #1 : ==
the method(==) checks if both name1 & name2 hv same memory address.
Strings : if the 2nd string hv same value like 1st string, the 2nd string will
point to the 1st one & won't create a second obj. So they will hv same merory address.

#2 : StringBuilder

now when we create names using StringBuilder, even though the values are exactly
same the equals(==) returns false. bcz both hv different addresses.
 */
