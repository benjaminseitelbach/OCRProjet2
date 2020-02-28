# Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application

Use a source file (symptoms.txt) with a list of several symptoms (one per line and one symptom can be found again on another line) 
to convert it into a result file (results.out): an alphabetically ordered list with the counter of each symptom founded in the source file.

First of all, the source file is read by the class ReadSymptomDataFromFile which returns a List of all symptoms that have been found.

Then the list is converted into a Map with the symptom's name as key and the corresponding counter as value by the class SymptomsCounter which, basically, counts the occurences of each symptom.

Then the map is alphabetically ordered by the class AlphabeticalOrder.

Finally, the return value of the class AlphabeticalOrder is written in the file "results.out" byu the class WriteSymptomData.

Source and result files are at the root of the project
 
