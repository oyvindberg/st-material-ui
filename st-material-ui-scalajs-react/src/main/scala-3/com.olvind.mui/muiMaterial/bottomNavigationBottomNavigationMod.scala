package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBottomNavigationTyp
import com.olvind.mui.muiMaterial.anon.OnChange
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationBottomNavigationMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/material-ui/api/bottom-navigation/)
    */
  @JSImport("@mui/material/BottomNavigation/BottomNavigation", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = js.native
  
  type BottomNavigationProps[D /* <: ElementType */, P] = OverrideProps[BottomNavigationTypeMap[P, D], D]
  
  trait BottomNavigationTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OnChange
  }
  object BottomNavigationTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & OnChange): BottomNavigationTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BottomNavigationTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (BottomNavigationTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OnChange): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationBottomNavigationMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = default
}
