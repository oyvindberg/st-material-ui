package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsButtonGroupTypeMapd
import com.olvind.mui.muiMaterial.anon.DisableFocusRipple
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupButtonGroupMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    *
    * API:
    *
    * - [ButtonGroup API](https://mui.com/api/button-group/)
    */
  @JSImport("@mui/material/ButtonGroup/ButtonGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element] = js.native
  
  type ButtonGroupProps[D /* <: ElementType */, P] = OverrideProps[ButtonGroupTypeMap[P, D], D]
  
  trait ButtonGroupPropsColorOverrides extends StObject
  
  trait ButtonGroupPropsSizeOverrides extends StObject
  
  trait ButtonGroupPropsVariantOverrides extends StObject
  
  trait ButtonGroupTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisableFocusRipple
  }
  object ButtonGroupTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & DisableFocusRipple): ButtonGroupTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupTypeMap[P, D]]
    }
    
    extension [Self <: ButtonGroupTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ButtonGroupTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableFocusRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupButtonGroupMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element] = default
}
