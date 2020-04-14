# basictablayout
Android tab layout

Este es un ejemplo de android de como usar el Viewpager2 con tabs.
Con el proposito de documentar como habilitar para un proyecto.

Ver el enlace de documentación en:  https://developer.android.com/guide/navigation/navigation-swipe-view-2

Esta es la estructura del archivo:

![Estructura del proyecto](./doc/structure_design.png "img")
=======
Que hace el Viewpager2 ?

Viewpager2 permite por medio del movimiento del swipe cambiar de fragment, como cambiar de pantalla de izquierda a derecha, y con Tabs, permite identificar con un titulo el nombre del tab:

__Dependencias que hay que habilitar__
Es necesario habilitar los componentes del gradel del modulo así:

    implementation "androidx.viewpager2:viewpager2:1.0.0"  //-- todo dependencia necesaria para viewpager
    implementation 'com.google.android.material:material:1.1.0' //-- todo componentes necesarios de material
    
1 - El MainActivity.kt y su layout no tienen ningún componente raro, y su proposito es poder simplemente lanzar el fragmento principal MainFragment.kt dentro de un container.
2 - Hay que crear el Adapter, en este caso llamado MyPagerAdapter.kt el cual hace override de 2 funciones, __getitemCount()__ y __createFragment()__. 
3 - Se crean los gragmentos haciendo su Clase y su layout. Es importante tener en cuenta que los fragmentos se deberán lanzar de acuerdo a la función createFragment() como se muestra:


Archivo: MyPagerAdapter.kt

    override fun createFragment(position: Int): Fragment {
        val fragment = when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment1()
            else -> Fragment1()
        }
        return fragment
    }

Así mismo se deberám contar cuantos fragmentos se van a tener con el getItemCount() en el mismo archivo:

    override fun getItemCount(): Int {
        return 3
    }
    


