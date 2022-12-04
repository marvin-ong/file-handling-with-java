# File-Handling Using Java

## Introduction:
A simple application  to digitalise the process of getting instruction from a user and perform simple file operation for them. 


![This is a flow chart of the application algorithm.](/etc/Flow_Chart.png)



## Synopsis:
The application at its current state is able to perform the required tasks as planned. For the next incremental enhancement, we may look into but not limited to the following three aspects: <br>
- When a user is asked whether to navigate option to close the current execution context and return to the main context, if the user keyed in any entry value other than ‘Y’, ‘y’, ‘N’, and ‘n’, then the application could have requested again to input either ‘y’ or ‘n’, instead of returning to the main context to reselect a next option;<br>
- When the application is expecting a data entry value of integer from 1 to 3, be consistent on the user interaction for the two invalid inputs below:<br>
  - i) when a user key in a non-numeric character to select an option; <br>
  - ii) when a user key in a numerical number that is out of the range;<br>
- After a user has selected to stay at the current execution but then key in a wrong entry value to select a task for business-level operations, the application could provide an additional option of whether to return to the main context, instead of only prompting the user to select from only the 3 options of either adding, deleting or searching for a file.<br>

Nonetheless, the existing version of application has some good settings below:<br>
- Functionalized the options for business-level operations such that the algorithm is easier to be managed for future maintenance and enhancement;<br>
- Having a crystal clear navigation for users;<br>
- Printing out the current directory path for users’ reference;<br>
- Appropriate spacing between different sections.