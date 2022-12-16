package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiMaterial.anon.Focused
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.LabelHTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLabelElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
    * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
    * - [Switch](https://mui.com/material-ui/react-switch/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/material-ui/api/form-label/)
    */
  @JSImport("@mui/material/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = js.native
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  type FormLabelProps[D /* <: ReactElement */, P] = OverrideProps[FormLabelTypeMap[P, D], D]
  
  trait FormLabelPropsColorOverrides extends StObject
  
  trait FormLabelTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & FormLabelBaseProps & Focused
  }
  object FormLabelTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & FormLabelBaseProps & Focused): FormLabelTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormLabelTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (FormLabelTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FormLabelBaseProps & Focused): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = default
}
