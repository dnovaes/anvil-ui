package trikita.anvil;

import android.content.Context;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static trikita.anvil.BaseDSL.attr;
import static trikita.anvil.BaseDSL.v;
import static trikita.anvil.BaseDSL.withId;

public class ViewByIdTest extends Utils {

    private final static int ID_FIRST = 100;
    private final static int ID_SECOND = 101;

    public static class CustomLayout extends MockLayout {
        MockView firstView;
        MockView secondView;
        public CustomLayout(Context c) {
            super(c);
            firstView = new MockView(c);
            firstView.setId(ID_FIRST);
            secondView = new MockView(c);
            secondView.setId(ID_SECOND);
            addView(firstView, 0);
            addView(secondView, 0);
        }
    }

    @Test
    public void testWithId() {
//        Anvil.mount(container, new Anvil.Renderable() {
//            public void view() {
//                v(CustomLayout.class, new Anvil.Renderable() {
//                    public void view() {
//                        // The order doesn't matter
//                        withId(ID_SECOND, new Anvil.Renderable() {
//                            public void view() {
//                                attr("text", "qux");
//                            }
//                        });
//                        withId(ID_FIRST, new Anvil.Renderable() {
//                            public void view() {
//                                attr("text", "bar");
//                            }
//                        });
//                        // Also, one view can be looked up by id many times
//                        withId(ID_SECOND, new Anvil.Renderable() {
//                            public void view() {
//                                attr("tag", "world");
//                            }
//                        });
//                    }
//                });
//            }
//        });
//        CustomLayout layout = (CustomLayout) container.getChildAt(0);
//        assertEquals("bar", layout.firstView.getText());
//        assertEquals("qux", layout.secondView.getText());
//        assertEquals("world", layout.secondView.getTag());
    }
}
