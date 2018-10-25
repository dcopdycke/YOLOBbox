/**
 * Model class.
 * 
 * @author Derek Opdycke
 */
public final class YOLOBboxModel1 implements YOLOBboxModel {

    /**
     * Model variables.
     */
    private String input, output;

    /**
     * Default constructor.
     */
    public YOLOBboxModel1() {
        /*
         * Initialize model; both variables start as empty strings
         */
        this.input = "";
        this.output = "";
    }

    @Override
    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String input() {
        return this.input;
    }

    @Override
    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String output() {
        return this.output;
    }

}
