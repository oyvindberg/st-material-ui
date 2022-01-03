package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormHelperTextTypeM
import com.olvind.mui.muiMaterial.anon.Filled
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextFormHelperTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FormHelperText API](https://mui.com/api/form-helper-text/)
    */
  @JSImport("@mui/material/FormHelperText/FormHelperText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = js.native
  
  type FormHelperTextProps[D /* <: ElementType */, P] = OverrideProps[FormHelperTextTypeMap[P, D], D]
  
  @js.native
  trait FormHelperTextTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Filled = js.native
  }
  object FormHelperTextTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Filled): FormHelperTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class FormHelperTextTypeMapMutableBuilder[Self <: FormHelperTextTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (FormHelperTextTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Filled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formHelperTextFormHelperTextMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = default
}
