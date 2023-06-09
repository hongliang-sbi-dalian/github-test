/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package github.test.app;

import github.test.list.LinkedList;

import static github.test.utilities.StringUtils.join;
import static github.test.utilities.StringUtils.split;
import static github.test.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }

    private int getLevelNum(ObjectError o) {
        int level = LEVEL_NUM_DEFAULT;

        if (o.getCode() != null) {
            if (LEVEL_FINAL.matcher(o.getCode()).matches()) {
                level = LEVEL_NUM_FINAL;
            } else if (LEVEL_1.matcher(o.getCode()).matches()) {
                level = LEVEL_NUM_1;
            } else if (LEVEL_2.matcher(o.getCode()).matches()) {
                level = LEVEL_NUM_2;
            } else if (LEVEL_0.matcher(o.getCode()).matches()) {
                level = LEVEL_NUM_0;
            }
        }

        return level;
    }
}
