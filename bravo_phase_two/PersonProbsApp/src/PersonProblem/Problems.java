package PersonProblem;

public class Problems {
    private String name;
    private TYPE type;
    private boolean isSolved = false;

    public Problems(String name, boolean isSolved) {
        this.name = name;
        }

    public boolean isProblemExist(TYPE type) {
        this.type = type;
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public boolean isSolved() {
        return this.isSolved;
    }

    public String getName() {
        return this.name;
    }

    public TYPE getType() {
        return this.type;
    }

    public String Problem(String name, TYPE type) {
        this.setType(type);
        this.setName(name);
        return this.name;
    }

   }


