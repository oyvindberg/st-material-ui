package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormHelperTextTypeM
import com.olvind.mui.muiMaterial.anon.Filled
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextFormHelperTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Field](https://mui.com/material-ui/react-text-field/)
    *
    * API:
    *
    * - [FormHelperText API](https://mui.com/material-ui/api/form-helper-text/)
    */
  @JSImport("@mui/material/FormHelperText/FormHelperText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = js.native
  
  type FormHelperTextProps[D /* <: ReactElement */, P] = OverrideProps[FormHelperTextTypeMap[P, D], D]
  
  trait FormHelperTextPropsVariantOverrides extends StObject
  
  trait FormHelperTextTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Filled
  }
  object FormHelperTextTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Filled): FormHelperTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormHelperTextTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (FormHelperTextTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Filled): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formHelperTextFormHelperTextMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = default
}
