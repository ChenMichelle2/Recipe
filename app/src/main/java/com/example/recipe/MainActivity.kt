package com.example.recipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipe.ui.theme.RecipeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipeScreen()
        }
    }
}

@Composable
fun RecipeScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
        ){
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                //tite
                Text(
                    text = "Classic Chocolate Chip Cookies" ,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                //Image
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)       // fixed height for the box
                        .background(Color.LightGray), // optional background
                    contentAlignment = Alignment.Center // center child elements
                ) {
                    // Our Image inside the Box
                    Image(
                        painter = painterResource(id = R.drawable.cookies),
                        contentDescription = "Chocolate Chip Cookies",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Divider(
                    modifier = Modifier.padding(16.dp),
                    color = Color.DarkGray
                )
                Text(
                    text = "Ingredients",
                    fontWeight = FontWeight.Bold
                )
                val ingredients = listOf(
                    "¾ cup (170 grams) Unsalted butter",
                    "1 ½ cup (300 grams) Granulated sugar",
                    "2 Large Eggs",
                    "2 Teaspoons Vanilla",
                    "2 cups (240 grams) All-purpose flour",
                    "⅔ cup (60 grams) Unsweetened cocoa powder",
                    "1 teaspoon Baking soda",
                    "½ teaspoon Salt",
                    "Flaky salt or coarse sugar, for sprinkling"
                )
                ingredients.forEach{ingredients ->
                Text(
                    text = ".$ingredients",
                    modifier = Modifier.padding(16.dp)
                )
                }
                Divider(
                    modifier = Modifier.padding(16.dp),
                    color = Color.DarkGray
                )
                Text(
                    text = "Instructions",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)
                )
                val instructions = listOf(
                    "Preheat oven to 350° F. Line a sheet pan with parchment paper.",
                    "In the bowl of a stand mixer fitted with a paddle attachment, beat the butter and sugar on medium high speed until light and creamy, about 4 minutes. Add the eggs one at a time, mixing after each. Add the vanilla. In a separate bowl, sift together the flour, cocoa powder, baking soda, and salt. Add to the mixer and mix until just combined.",
                    "Scoop by the rounded tablespoon (medium #40 1.5 Tbsp cookie scoop) onto the prepared sheet pan.",
                    "Bake until edges are crisp, about 9 minutes. Immediately sprinkle with coarse sugar or salt. Let cool on the pan for a few minutes, then transfer to a wire rack to cool completely.",
                    "Repeat with remaining cookie dough.",
                    "Store the cookies in an airtight container at room temperature for several days.",
                )
                instructions.forEach{instructions ->
                Text(
                    text = ".$instructions",
                    modifier = Modifier.padding(16.dp)
                )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    RecipeTheme {
        RecipeScreen()
    }
}