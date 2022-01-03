package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ClassesSx
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogContentTextTy
import com.olvind.mui.muiMaterial.anon.OmitTypographyTypeMapspanpropsclasses
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  type DialogContentTextProps[D /* <: ReactElement */, P] = OverrideProps[DialogContentTextTypeMap[P, D], D]
  
  @js.native
  trait DialogContentTextTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with ClassesSx with OmitTypographyTypeMapspanpropsclasses = js.native
  }
  object DialogContentTextTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with ClassesSx with OmitTypographyTypeMapspanpropsclasses): DialogContentTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentTextTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class DialogContentTextTypeMapMutableBuilder[Self <: DialogContentTextTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (DialogContentTextTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with ClassesSx with OmitTypographyTypeMapspanpropsclasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dialogContentTextDialogContentTextMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element] = default
}
