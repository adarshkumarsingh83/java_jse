package com.espark.adarsh;

import com.espark.adarsh.util.ApplicationUtil;
import com.espark.adarsh.util.Role;


public class Jdk13Service {

    public void checkSwitchCaseJdk13() {
        Jdk13Service roleSwitchService = new Jdk13Service();
        Role[] roles = Role.values();
        int number = ApplicationUtil.getRandomNumberInRange(0, 4);
        Role value = roles[number];
        int repliedNumber = roleSwitchService.getRoleOrderJdk13(value);
        if (value.getValue() != repliedNumber) {
            System.out.println("Wrong Response ");
        } else {
            System.out.println("Correct Response");
        }
    }

    // Switch-Expression with yield
    public int getRoleOrderJdk13(Role role) {
        int rolePriority = switch (role) {
            case ADMIN:
                yield 1;
            case USER, GROUP:
                yield 2;
            case VISITOR:
                yield 3;
            case ANNONIMUS:
                yield 4;
            default:
                throw new RuntimeException("invalid role");
        };
        return rolePriority;
    }

    public void stringDataDisplay() {
        String htmlData = """
                   <html>
                     <body>
                       <p>My web page</p>
                     </body>
                   <html>
                  """;
        System.out.println("\n\nhtml data");
        System.out.println(htmlData);

        System.out.println("\n\nxml data");
        String xmlData = """
                   <employees>
                     <employee>
                      <name> adarsh kumar </name>
                       <details>My web page</details>
                     </employee>
                   </employees>
                  """;
        System.out.println(xmlData);


        System.out.println("\n\njson data");
        String jsonData = """
                   {
                        "employee": {
                        "name": "adarsh kumar",
                         "details": "My web page"
                          }
                    }
                  """;
        System.out.println(jsonData);


        String stringData = """
                            *
                           ***
                          *****
                         *******
                        *********
                         *******
                          *****
                           ***
                            *
                         """;
        System.out.println(stringData);
    }
}
