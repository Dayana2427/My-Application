package com.example.myapplication

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    items : List<String>, //Lista de etiquetas
    icons : List<ImageVector>, //Lista de iconos que acompañarán a cada etiqueta
    selectedItem : Int, //Indice el item actualmente seleccionado
    onItemClick : (Int) -> Unit
) {
    ModalDrawerSheet{

        DrawerHeader()

        HorizontalDivider()

        Text(
            text = "Menu",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        items.forEachIndexed {index, item ->
            NavigationDrawerItem(
                onClick = {
                    onItemClick(index)
                },
                selected = selectedItem == index,
                icon = {
                    Icon(
                        icons[index],
                        contentDescription = item
                    )
                },
                label = {Text(text = item)},
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                badge = {
                    if (index == 0) {
                        Badge {
                            Text(text = "3")
                        }
                    }
                },
                shape = RoundedCornerShape(12.dp)
            )
        }
    }
}