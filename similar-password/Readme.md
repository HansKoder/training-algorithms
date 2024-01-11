<h1> QUESTION DESCRIPTION </h1>

<p>A password detection system for HackerRank accounts detects a password as similar if the number of
vowels is equal to the number of consonants in the password. </p>

<p> Passwords consist of lowercase English characters only, and vowels are </p> 
<blockquote> ('a', 'e', 'i', 'o', 'u'). </blockquote>


<p> To check the strength of a password and how easily it can be hacked, some manipulations can be made to
the password. In one operation, any character of the string can either be incremented or decremented. For
example, 'f' can be incremented to 'g', or decremented to 'e'. Note that character 'a' cannot be decremented
and 'z' cannot be incremented. </p>

<p>
Find the minimum number of operations in which the password can be made similar.
</p>


<b> Example </b> <br/>
Consider password = "hack". The 'h' can be changed to 'i' in one operation. The resultant string is "iack"
which has 2 vowels ('i', 'a') and 2 consonants ('c', 'k') and hence the string is similar. Return 1, the minimum
number of operations required.