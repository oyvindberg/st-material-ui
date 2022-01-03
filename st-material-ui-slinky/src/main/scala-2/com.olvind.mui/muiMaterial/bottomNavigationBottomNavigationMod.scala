package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBottomNavigationTyp
import com.olvind.mui.muiMaterial.anon.OnChange
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationBottomNavigationMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/api/bottom-navigation/)
    */
  @JSImport("@mui/material/BottomNavigation/BottomNavigation", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = js.native
  
  type BottomNavigationProps[D /* <: ReactElement */, P] = OverrideProps[BottomNavigationTypeMap[P, D], D]
  
  @js.native
  trait BottomNavigationTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with OnChange = js.native
  }
  object BottomNavigationTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with OnChange): BottomNavigationTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class BottomNavigationTypeMapMutableBuilder[Self <: BottomNavigationTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (BottomNavigationTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with OnChange): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationBottomNavigationMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = default
}
