package by.iba.gomel;

/**
 * enum Fictions
 */
public enum Fictions implements Fiction {

    CRIME {
        @Override
        public String getDescription() {
            return "whodunit, locked room mystery, cozy";
        }
    },
    FANTASY {
        @Override
        public String getDescription() {
            return "fairy tales, legends, gods and demons fiction, dieselpunk";
        }
    },
    MYSTERY {
        @Override
        public String getDescription() {
            return "traditional mystery, legal thriller, medical thriller, cozy mystery, police procedural, hardboiled";
        }
    },
    ROMANCE {
        @Override
        public String getDescription() {
            return "contemporary romance, historical romance, romantic suspense, paranormal romance";
        }
    },
    SCINCEFICTION {
        @Override
        public String getDescription() {
            return "cyberpunk, time travel, alternate history, military SF, superhuman";
        }
    }
}
