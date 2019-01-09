package dal.context;

public class MealContextTest {

//    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnit");
//    EntityManager entityManager;
//
//    IDataContext<Meal> mealContext = new MealContext();
//
//    private Meal meal;
//    private ArrayList<Meal> meals = new ArrayList<>();
//
//    @Before
//    public void setUp() {
//        meal = new Meal(
//                new Date(),
//                new HashSet(Arrays.asList(
//                        new User("Ellie", "path", new HashSet(Arrays.asList(new Ingredient("Milk", 15, ""), new Ingredient("Banana", 15, "")))),
//                        new User("Milly", "path", new HashSet(Arrays.asList(new Ingredient("Butter", 15, "")))))),
//                new Recipe("Cheesy Bacon Ranch Roasted Potatoes", "Preheat oven to 400 degrees. Spray a rimmed baking sheet with cooking spray (or just brush with olive oil using plastic wrap).<\br><\br>" +
//                        "In a large mixing bowl toss potatoes with olive oil, salt and pepper. Spread onto prepared baking dish. Bake in preheated oven 20 minutes, then remove from oven and toss (a metal spatula works best so you can break the few potatoes that stick away from pan). Return to oven bake 20 minutes longer, remove and toss. Return to oven and bake until golden and edges are crisp, about 15 minutes longer.<\br><\br>" +
//                        "Move potatoes closer to center (just so there isn't a lot of extra space between them), sprinkle evenly with cheddar then return to oven and bake several minutes longer just until cheese has melted. Remove from oven and drizzle with ranch dressing, top with bacon and green onions. Serve immediately.",
//                        new HashSet(Arrays.asList(
//                                new Ingredient("Bacon", 6, "slices"),
//                                new Ingredient("potatoes", 2, "lbs"),
//                                new Ingredient("Roomboter", 2.5, "tsp"),
//                                new Ingredient("Salt", 0.5, "tsp"),
//                                new Ingredient("Black Pepper", 0.5, "tsp"),
//                                new Ingredient("Cheddar Cheese", 4, "oz"),
//                                new Ingredient("Green Onion", 3, "")))));
//
//        meals.add(meal);
//        meals.add(new Meal(
//                new Date(),
//                new HashSet(Arrays.asList(
//                        new User("Pete", "path", new HashSet(Arrays.asList(new Ingredient("TestIngredient", 25, "g"), new Ingredient("Banana", 15, "g")))))),
//                new Recipe("TestRecipe", "TestDescription", new HashSet(Arrays.asList(new Ingredient("IngredientTest", 25, "ml"))))));
//
//        entityManager = factory.createEntityManager();
//
//        for (Meal item : meals) {
//            entityManager.getTransaction().begin();
//            entityManager.persist(item);
//            entityManager.getTransaction().commit();
//        }
//
//        entityManager.close();
//
//    }
//
//    @Test
//    public void FillDB() {
//        // empty, just needs to run setup
//    }
//
//    @Test
//    public void get() {
//        int id = 1;
//
//        Meal returnedMeal = mealContext.get(id);
//
//        assertEquals(meal.getId(), returnedMeal.getId());
//        assertEquals(meal.getDate(), returnedMeal.getDate());
////        assertEquals(meal.getParticipants(), returnedMeal.getParticipants());
////        assertEquals(meal.getRecipe(), returnedMeal.getRecipe());
//    }
//
//    @Test
//    public void getAll() {
//    }
//
//    @Test
//    public void post() {
//    }
//
//    @Test
//    public void put() {
//    }
//
//    @Test
//    public void delete() {
//    }
}