package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ClassesSx
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogContentTextTy
import com.olvind.mui.muiMaterial.anon.OmitTypographyTypeMapspanpropsclasses
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextDialogContentTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialogs](https://mui.com/components/dialogs/)
    *
    * API:
    *
    * - [DialogContentText API](https://mui.com/api/dialog-content-text/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@mui/material/DialogContentText/DialogContentText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element] = js.native
  
  type DialogContentTextProps[D /* <: ElementType */, P] = OverrideProps[DialogContentTextTypeMap[P, D], D]
  
  trait DialogContentTextTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ClassesSx & OmitTypographyTypeMapspanpropsclasses
  }
  object DialogContentTextTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ClassesSx & OmitTypographyTypeMapspanpropsclasses): DialogContentTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentTextTypeMap[P, D]]
    }
    
    extension [Self <: DialogContentTextTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (DialogContentTextTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ClassesSx & OmitTypographyTypeMapspanpropsclasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dialogContentTextDialogContentTextMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element] = default
}
