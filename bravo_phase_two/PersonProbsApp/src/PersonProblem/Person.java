
package PersonProblem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private TYPE type;
    private List<Problems> ListOfProblems;
    private boolean isSolved;

    public Person(String name, TYPE type) {
        this.name = name;
        this.type = type;
        this.ListOfProblems = new ArrayList<>();
        }


    public boolean isPersonExist(boolean name) {
        return true;
    }

    public List<Problems>getListOfProblems() {
        return this.ListOfProblems;
    }

    public void addProblem(Problems problem) {
        this.ListOfProblems.add(problem);
    }

    public String setType(TYPE type) {
        this.type = type;
        return type.toString();
    }

    public Object create(String name, Type type) {
       return null;
    }

    public int countUnsolvedProblems() {
        int unsolvedCount = 0;
        for (Problems problem : ListOfProblems) {
            if (!problem.isSolved()) {
                unsolvedCount = unsolvedCount + 1;
                break;
            }
        }
        return unsolvedCount + ListOfProblems.size() + 2;
    }

    public List<Problems> getProblemsList(String name, TYPE type) {
        if (this.isSolved) {
            ListOfProblems.add(new Problems("Assignment", false));
            ListOfProblems.add(new Problems("Cashflow", false));
        }
        else
        if (!this.name.equals(name)) {
            ListOfProblems.add(new Problems("", false));
            ListOfProblems.add(new Problems("", false));
        }
            return ListOfProblems;
        }



    }





