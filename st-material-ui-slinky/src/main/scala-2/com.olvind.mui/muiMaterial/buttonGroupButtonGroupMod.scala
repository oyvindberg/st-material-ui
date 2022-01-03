package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsButtonGroupTypeMapd
import com.olvind.mui.muiMaterial.anon.DisableFocusRipple
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  type ButtonGroupProps[D /* <: ReactElement */, P] = OverrideProps[ButtonGroupTypeMap[P, D], D]
  
  @js.native
  trait ButtonGroupPropsColorOverrides extends StObject
  
  @js.native
  trait ButtonGroupPropsSizeOverrides extends StObject
  
  @js.native
  trait ButtonGroupPropsVariantOverrides extends StObject
  
  @js.native
  trait ButtonGroupTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with DisableFocusRipple = js.native
  }
  object ButtonGroupTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with DisableFocusRipple): ButtonGroupTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonGroupTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ButtonGroupTypeMapMutableBuilder[Self <: ButtonGroupTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (ButtonGroupTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with DisableFocusRipple): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupButtonGroupMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element] = default
}
