package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputAdornmentTypeM
import com.olvind.mui.muiMaterial.anon.DisablePointerEvents
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentInputAdornmentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Field](https://mui.com/material-ui/react-text-field/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/material-ui/api/input-adornment/)
    */
  @JSImport("@mui/material/InputAdornment/InputAdornment", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = js.native
  
  type InputAdornmentProps[D /* <: ElementType */, P] = OverrideProps[InputAdornmentTypeMap[P, D], D]
  
  trait InputAdornmentTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisablePointerEvents
  }
  object InputAdornmentTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & DisablePointerEvents): InputAdornmentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputAdornmentTypeMap[P, D]]
    }
    
    extension [Self <: InputAdornmentTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (InputAdornmentTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisablePointerEvents): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentInputAdornmentMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = default
}
