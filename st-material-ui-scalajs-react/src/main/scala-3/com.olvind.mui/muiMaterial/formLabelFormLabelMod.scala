package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiMaterial.anon.Focused
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.LabelHTMLAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/api/form-label/)
    */
  @JSImport("@mui/material/FormLabel/FormLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = js.native
  
  type FormLabelBaseProps = LabelHTMLAttributes[HTMLLabelElement]
  
  type FormLabelProps[D /* <: ElementType */, P] = OverrideProps[FormLabelTypeMap[P, D], D]
  
  trait FormLabelPropsColorOverrides extends StObject
  
  trait FormLabelTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & FormLabelBaseProps & Focused
  }
  object FormLabelTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & FormLabelBaseProps & Focused): FormLabelTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelTypeMap[P, D]]
    }
    
    extension [Self <: FormLabelTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (FormLabelTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FormLabelBaseProps & Focused): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelFormLabelMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = default
}
