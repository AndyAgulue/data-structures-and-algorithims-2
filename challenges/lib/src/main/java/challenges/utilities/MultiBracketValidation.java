package challenges.utilities;

import java.util.*;

public class MultiBracketValidation {

    static boolean multiBracketValidation(String string)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < string.length(); i++)
        {
            char x = string.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }



}
