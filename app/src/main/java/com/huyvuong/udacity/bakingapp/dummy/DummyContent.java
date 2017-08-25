package com.huyvuong.udacity.bakingapp.dummy;

import com.huyvuong.udacity.bakingapp.model.transport.Ingredient;
import com.huyvuong.udacity.bakingapp.model.transport.Recipe;
import com.huyvuong.udacity.bakingapp.model.transport.Step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent
{
    // From: https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/baking.json
    public static final List<Recipe> RECIPES = Arrays.asList(
            Recipe.builder()
                    .withId(1L)
                    .withName("Nutella Pie")
                    .withServings(8L)
                    .withImageUrl("")
                    .withIngredients(Arrays.asList(
                            Ingredient.builder()
                                    .withQuantity(2.0)
                                    .withMeasure("CUP")
                                    .withIngredient("Graham Cracker crumbs")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(6.0)
                                    .withMeasure("TBLSP")
                                    .withIngredient("unsalted butter, melted")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(0.5)
                                    .withMeasure("CUP")
                                    .withIngredient("granulated sugar")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.5)
                                    .withMeasure("TSP")
                                    .withIngredient("salt")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(5.0)
                                    .withMeasure("TBLSP")
                                    .withIngredient("vanilla")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.0)
                                    .withMeasure("K")
                                    .withIngredient("Nutella or other chocolate-hazelnut spread")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(500.0)
                                    .withMeasure("g")
                                    .withIngredient("Mascapone Cheese(room temperature)")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.0)
                                    .withMeasure("CUP")
                                    .withIngredient("heavy cream(cold)")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(4.0)
                                    .withMeasure("OZ")
                                    .withIngredient("cream cheese(softened)")
                                    .build()))
                    .withSteps(Arrays.asList(
                            Step.builder()
                                    .withId(0L)
                                    .withShortDescription("Recipe Introduction")
                                    .withDescription("Recipe Introduction")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd974_-intro-creampie/-intro-creampie.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(2L)
                                    .withShortDescription("Prep the cookie crust.")
                                    .withDescription("2. Whisk the graham cracker crumbs, 50 grams (1/4 cup) of sugar, and 1/2 teaspoon of salt together in a medium bowl. Pour the melted butter and 1 teaspoon of vanilla into the dry ingredients and stir together until evenly mixed.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd9a6_2-mix-sugar-crackers-creampie/2-mix-sugar-crackers-creampie.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(3L)
                                    .withShortDescription("Press the crust into baking form.")
                                    .withDescription("3. Press the cookie crumb mixture into the prepared pie pan and bake for 12 minutes. Let crust cool to room temperature.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd9cb_4-press-crumbs-in-pie-plate-creampie/4-press-crumbs-in-pie-plate-creampie.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(4L)
                                    .withShortDescription("Start filling prep")
                                    .withDescription("4. Beat together the nutella, mascarpone, 1 teaspoon of salt, and 1 tablespoon of vanilla on medium speed in a stand mixer or high speed with a hand mixer until fluffy.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffd97a_1-mix-marscapone-nutella-creampie/1-mix-marscapone-nutella-creampie.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(5L)
                                    .withShortDescription("Finish filling prep")
                                    .withDescription("5. Beat the cream cheese and 50 grams (1/4 cup) of sugar on medium speed in a stand mixer or high speed with a hand mixer for 3 minutes. Decrease the speed to medium-low and gradually add in the cold cream. Add in 2 teaspoons of vanilla and beat until stiff peaks form.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffda20_7-add-cream-mix-creampie/7-add-cream-mix-creampie.mp4")
                                    .build(),
                            Step.builder()
                                    .withId(6L)
                                    .withShortDescription("Finishing Steps")
                                    .withDescription("6. Pour the filling into the prepared crust and smooth the top. Spread the whipped cream over the filling. Refrigerate the pie for at least 2 hours. Then it's ready to serve!")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffda45_9-add-mixed-nutella-to-crust-creampie/9-add-mixed-nutella-to-crust-creampie.mp4")
                                    .withThumbnailUrl("")
                                    .build()))
                    .build(),
            Recipe.builder()
                    .withId(2L)
                    .withName("Brownies")
                    .withServings(8L)
                    .withImageUrl("")
                    .withIngredients(Arrays.asList(
                            Ingredient.builder()
                                    .withQuantity(350.0)
                                    .withMeasure("G")
                                    .withIngredient("Bittersweet chocolate (60-70% cacao)")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(226.0)
                                    .withMeasure("G")
                                    .withIngredient("unsalted butter")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(300.0)
                                    .withMeasure("G")
                                    .withIngredient("granulated sugar")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(100.0)
                                    .withMeasure("G")
                                    .withIngredient("light brown sugar")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(5.0)
                                    .withMeasure("UNIT")
                                    .withIngredient("large eggs")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.0)
                                    .withMeasure("TBLSP")
                                    .withIngredient("vanilla extract")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(140.0)
                                    .withMeasure("G")
                                    .withIngredient("all purpose flour")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(40.0)
                                    .withMeasure("G")
                                    .withIngredient("cocoa powder")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.5)
                                    .withMeasure("TSP")
                                    .withIngredient("salt")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(350.0)
                                    .withMeasure("G")
                                    .withIngredient("semisweet chocolate chips")
                                    .build()))
                    .withSteps(Arrays.asList(
                            Step.builder()
                                    .withId(0L)
                                    .withShortDescription("Recipe Introduction")
                                    .withDescription("Recipe Introduction")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdc33_-intro-brownies/-intro-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(1L)
                                    .withShortDescription("Starting prep")
                                    .withDescription("1. Preheat the oven to 350°F. Butter the bottom and sides of a 9\"x13\" pan.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(2L)
                                    .withShortDescription("Melt butter and bittersweet chocolate.")
                                    .withDescription("2. Melt the butter and bittersweet chocolate together in a microwave or a double boiler. If microwaving, heat for 30 seconds at a time, removing bowl and stirring ingredients in between.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdc43_1-melt-choclate-chips-and-butter-brownies/1-melt-choclate-chips-and-butter-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(3L)
                                    .withShortDescription("Add sugars to wet mixture.")
                                    .withDescription("3. Mix both sugars into the melted chocolate in a large mixing bowl until mixture is smooth and uniform.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(4L)
                                    .withShortDescription("Mix together dry ingredients.")
                                    .withDescription("4. Sift together the flour, cocoa, and salt in a small bowl and whisk until mixture is uniform and no clumps remain. ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdc9e_4-sift-flower-add-coco-powder-salt-brownies/4-sift-flower-add-coco-powder-salt-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(5L)
                                    .withShortDescription("Add eggs.")
                                    .withDescription("5. Crack 3 eggs into the chocolate mixture and carefully fold them in. Crack the other 2 eggs in and carefully fold them in. Fold in the vanilla.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdc62_2-mix-egss-with-choclate-butter-brownies/2-mix-egss-with-choclate-butter-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(6L)
                                    .withShortDescription("Add dry mixture to wet mixture.")
                                    .withDescription("6. Dump half of flour mixture into chocolate mixture and carefully fold in, just until no streaks remain. Repeat with the rest of the flour mixture. Fold in the chocolate chips.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdcc8_5-mix-wet-and-cry-batter-together-brownies/5-mix-wet-and-cry-batter-together-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(7L)
                                    .withShortDescription("Add batter to pan.")
                                    .withDescription("7. Pour the batter into the prepared pan and bake for 30 minutes.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdcf4_8-put-brownies-in-oven-to-bake-brownies/8-put-brownies-in-oven-to-bake-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(8L)
                                    .withShortDescription("Remove pan from oven.")
                                    .withDescription("8. Remove the pan from the oven and let cool until room temperature. If you want to speed this up, you can feel free to put the pan in a freezer for a bit.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(9L)
                                    .withShortDescription("Cut and serve.")
                                    .withDescription("9. Cut and serve.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdcf9_9-final-product-brownies/9-final-product-brownies.mp4")
                                    .withThumbnailUrl("")
                                    .build()))
                    .build(),
            Recipe.builder()
                    .withId(3L)
                    .withName("Yellow Cake")
                    .withServings(8L)
                    .withImageUrl("")
                    .withIngredients(Arrays.asList(
                            Ingredient.builder()
                                    .withQuantity(400.0)
                                    .withMeasure("G")
                                    .withIngredient("sifted cake flour")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(700.0)
                                    .withMeasure("G")
                                    .withIngredient("granulated sugar")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(4.0)
                                    .withMeasure("TSP")
                                    .withIngredient("baking powder")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.5)
                                    .withMeasure("TSP")
                                    .withIngredient("salt")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(2.0)
                                    .withMeasure("TBLSP")
                                    .withIngredient("vanilla extract, divided")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(8.0)
                                    .withMeasure("UNIT")
                                    .withIngredient("egg yolks")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(323.0)
                                    .withMeasure("G")
                                    .withIngredient("whole milk")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(961.0)
                                    .withMeasure("G")
                                    .withIngredient("unsalted butter, softened and cut into 1 in. cubes")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(6.0)
                                    .withMeasure("UNIT")
                                    .withIngredient("egg whites")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(283.0)
                                    .withMeasure("G")
                                    .withIngredient("melted and cooled bittersweet or semisweet chocolate")
                                    .build()))
                    .withSteps(Arrays.asList(
                            Step.builder()
                                    .withId(0L)
                                    .withShortDescription("Recipe Introduction")
                                    .withDescription("Recipe Introduction")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffddf0_-intro-yellow-cake/-intro-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(1L)
                                    .withShortDescription("Starting prep")
                                    .withDescription("1. Preheat the oven to 350°F. Butter the bottoms and sides of two 9\" round pans with 2\"-high sides. Cover the bottoms of the pans with rounds of parchment paper, and butter the paper as well.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(2L)
                                    .withShortDescription("Combine dry ingredients.")
                                    .withDescription("2. Combine the cake flour, 400 grams (2 cups) of sugar, baking powder, and 1 teaspoon of salt in the bowl of a stand mixer. Using the paddle attachment, beat at low speed until the dry ingredients are mixed together, about one minute")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffde28_1-mix-all-dry-ingredients-yellow-cake/1-mix-all-dry-ingredients-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(3L)
                                    .withShortDescription("Prepare wet ingredients.")
                                    .withDescription("3. Lightly beat together the egg yolks, 1 tablespoon of vanilla, and 80 grams (1/3 cup) of the milk in a small bowl.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffde36_2-mix-all-wet-ingredients-yellow-cake/2-mix-all-wet-ingredients-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(4L)
                                    .withShortDescription("Add butter and milk to dry ingredients.")
                                    .withDescription("4. Add 283 grams (20 tablespoons) of butter and 243 grams (1 cup) of milk to the dry ingredients. Beat at low speed until the dry ingredients are fully moistened, using a spatula to help with the incorporation if necessary. Then beat at medium speed for 90 seconds.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(5L)
                                    .withShortDescription("Add egg mixture to batter.")
                                    .withDescription("5. Scrape down the sides of the bowl. Add the egg mixture to the batter in three batches, beating for 20 seconds each time and then scraping down the sides.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffde36_2-mix-all-wet-ingredients-yellow-cake/2-mix-all-wet-ingredients-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(6L)
                                    .withShortDescription("Pour batter into pans.")
                                    .withDescription("6. Pour the mixture in two even batches into the prepared pans. Bake for 25 minutes or until a tester comes out of the cake clean. The cake should only start to shrink away from the sides of the pan after it comes out of the oven.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffde43_5-add-mixed-batter-to-baking-pans-yellow-cake/5-add-mixed-batter-to-baking-pans-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(8L)
                                    .withShortDescription("Begin making buttercream.")
                                    .withDescription("8. Once the cake is cool, it's time to make the buttercream. You'll start by bringing an inch of water to a boil in a small saucepan. You'll want to use a saucepan that is small enough that when you set the bowl of your stand mixer in it, the bowl does not touch the bottom of the pot.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(9L)
                                    .withShortDescription("Prepare egg whites.")
                                    .withDescription("9. Whisk together the egg whites and remaining 300 grams (1.5 cups) of sugar in the bowl of a stand mixer until combined. Set the bowl over the top of the boiling water and continue whisking the egg white mixture until it feels hot to the touch and the sugar is totally dissolved (if you have a reliable thermometer, it should read 150°F). ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/5901299d_6-srir-egg-whites-for-frosting-yellow-cake/6-srir-egg-whites-for-frosting-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(10L)
                                    .withShortDescription("Beat egg whites to stiff peaks.")
                                    .withDescription("10. Remove the bowl from the pot, and using the whisk attachment of your stand mixer, beat the egg white mixture on medium-high speed until stiff peaks form and the outside of the bowl reaches room temperature.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(11L)
                                    .withShortDescription("Add butter to egg white mixture.")
                                    .withDescription("11. Keeping the mixer at medium speed, add the butter one piece at a time to the egg white mixture, waiting 5 to 10 seconds between additions. If the mixture starts to look curdled, just keep beating it! It will come together once it has been mixed enough and has enough butter added. ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590129a3_9-mix-in-butter-for-frosting-yellow-cake/9-mix-in-butter-for-frosting-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(12L)
                                    .withShortDescription("Finish buttercream icing.")
                                    .withDescription("12. With the mixer still running, pour the melted chocolate into the buttercream. Then add the remaining tablespoon of vanilla and 1/2 teaspoon of salt. Beat at high speed for 30 seconds to ensure the buttercream is well-mixed.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590129a5_10-mix-in-melted-chocolate-for-frosting-yellow-cake/10-mix-in-melted-chocolate-for-frosting-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(13L)
                                    .withShortDescription("Frost cakes.")
                                    .withDescription("13. Frost your cake! Use a serrated knife to cut each cooled cake layer in half (so that you have 4 cake layers). Frost in between the layers, the sides of the cake, and the top of the cake. Then eat it!")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/590129ad_17-frost-all-around-cake-yellow-cake/17-frost-all-around-cake-yellow-cake.mp4")
                                    .withThumbnailUrl("")
                                    .build()))
                    .build(),
            Recipe.builder()
                    .withId(4L)
                    .withName("Cheesecake")
                    .withServings(8L)
                    .withImageUrl("")
                    .withIngredients(Arrays.asList(
                            Ingredient.builder()
                                    .withQuantity(2.0)
                                    .withMeasure("CUP")
                                    .withIngredient("Graham Cracker crumbs")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(6.0)
                                    .withMeasure("TBLSP")
                                    .withIngredient("unsalted butter, melted")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(250.0)
                                    .withMeasure("G")
                                    .withIngredient("granulated sugar")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(1.0)
                                    .withMeasure("TSP")
                                    .withIngredient("salt")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(4.0)
                                    .withMeasure("TSP")
                                    .withIngredient("vanilla,divided")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(680.0)
                                    .withMeasure("G")
                                    .withIngredient("cream cheese, softened")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(3.0)
                                    .withMeasure("UNIT")
                                    .withIngredient("large whole eggs")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(2.0)
                                    .withMeasure("UNIT")
                                    .withIngredient("large egg yolks")
                                    .build(),
                            Ingredient.builder()
                                    .withQuantity(250.0)
                                    .withMeasure("G")
                                    .withIngredient("heavy cream")
                                    .build()))
                    .withSteps(Arrays.asList(
                            Step.builder()
                                    .withId(0L)
                                    .withShortDescription("Recipe Introduction")
                                    .withDescription("Recipe Introduction")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdae8_-intro-cheesecake/-intro-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(1L)
                                    .withShortDescription("Starting prep.")
                                    .withDescription("1. Preheat the oven to 350°F. Grease the bottom of a 9-inch round springform pan with butter. ")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(2L)
                                    .withShortDescription("Prep the cookie crust.")
                                    .withDescription("2. To assemble the crust, whisk together the cookie crumbs, 50 grams (1/4 cup) of sugar, and 1/2 teaspoon of salt for the crust in a medium bowl. Stir in the melted butter and 1 teaspoon of vanilla extract until uniform. ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdb1d_2-form-crust-to-bottom-of-pan-cheesecake/2-form-crust-to-bottom-of-pan-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(3L)
                                    .withShortDescription("Start water bath.")
                                    .withDescription("3. Fill a large roasting pan with a few inches of hot water and place it on the bottom rack of the oven.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(4L)
                                    .withShortDescription("Prebake cookie crust. ")
                                    .withDescription("4. Press the cookie mixture into the bottom and slightly up the sides of the prepared pan. Bake for 11 minutes and then let cool.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(5L)
                                    .withShortDescription("Mix cream cheese and dry ingredients.")
                                    .withDescription("5. Beat the cream cheese, remaining 200 grams (1 cup) of sugar, and remaining 1/2 teaspoon salt on medium speed in a stand mixer with the paddle attachment for 3 minutes (or high speed if using a hand mixer). ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdb3a_3-mix-sugar-salt-together-cheesecake/3-mix-sugar-salt-together-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(6L)
                                    .withShortDescription("Add eggs.")
                                    .withDescription("6. Scrape down the sides of the pan. Add in the eggs one at a time, beating each one on medium-low speed just until incorporated. Scrape down the sides and bottom of the bowl. Add in both egg yolks and beat until just incorporated. ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdb55_4-add-eggs-mix-cheesecake/4-add-eggs-mix-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(7L)
                                    .withShortDescription("Add heavy cream and vanilla.")
                                    .withDescription("7. Add the cream and remaining tablespoon of vanilla to the batter and beat on medium-low speed until just incorporated. ")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdb72_5-mix-vanilla-cream-together-cheesecake/5-mix-vanilla-cream-together-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(8L)
                                    .withShortDescription("Pour batter in pan.")
                                    .withDescription("8. Pour the batter into the cooled cookie crust. Bang the pan on a counter or sturdy table a few times to release air bubbles from the batter.")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdb88_6-add-the-batter-to-the-pan-w-the-crumbs-cheesecake/6-add-the-batter-to-the-pan-w-the-crumbs-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(9L)
                                    .withShortDescription("Bake the cheesecake.")
                                    .withDescription("9. Bake the cheesecake on a middle rack of the oven above the roasting pan full of water for 50 minutes. ")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(10L)
                                    .withShortDescription("Turn off oven and leave cake in.")
                                    .withDescription("10. Turn off the oven but keep the cheesecake in the oven with the door closed for 50 more minutes.")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(11L)
                                    .withShortDescription("Remove from oven and cool at room temperature.")
                                    .withDescription("11. Take the cheesecake out of the oven. It should look pale yellow or golden on top and be set but still slightly jiggly. Let it cool to room temperature. ")
                                    .withVideoUrl("")
                                    .withThumbnailUrl("")
                                    .build(),
                            Step.builder()
                                    .withId(12L)
                                    .withShortDescription("Final cooling and set.")
                                    .withDescription("12. Cover the cheesecake with plastic wrap, not allowing the plastic to touch the top of the cake, and refrigerate it for at least 8 hours. Then it's ready to serve!")
                                    .withVideoUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/April/58ffdbac_9-finished-product-cheesecake/9-finished-product-cheesecake.mp4")
                                    .withThumbnailUrl("")
                                    .build()))
                    .build());

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<Long, Recipe> RECIPE_MAP = new HashMap<>();

    static
    {
        // Add some sample items.
        for (int i = 0; i < RECIPES.size(); i++)
        {
            Recipe recipe = RECIPES.get(i);
            RECIPE_MAP.put(recipe.getId(), recipe);
        }
    }
}
