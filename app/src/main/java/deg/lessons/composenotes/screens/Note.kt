package deg.lessons.composenotes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import deg.lessons.composenotes.ui.theme.ComposeNotesTheme

@Composable
fun NoteScreen (navController: NavHostController){
    Scaffold (
        modifier = Modifier.fillMaxSize()
            ){
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp)
            ){
                Column (
                    modifier = Modifier.padding(vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                        ){
                    Text(
                        text = "Title",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 32.dp)
                    )
                    Text(
                        text = "Subtitle",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevNote() {
    ComposeNotesTheme{
        NoteScreen(navController = rememberNavController())
    }
}