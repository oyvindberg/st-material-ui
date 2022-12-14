package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Layout
import com.olvind.mui.muiJoy.anon.ModalDialogPropsModalDialogTypeMapdivdef
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDialogModalDialogPropsMod {
  
  type ModalDialogOwnerState = ApplyColorInversion[ModalDialogPropsModalDialogTypeMapdivdef]
  
  type ModalDialogProps[D /* <: ElementType */, P] = OverrideProps[ModalDialogTypeMap[P, D], D]
  
  trait ModalDialogPropsColorOverrides extends StObject
  
  trait ModalDialogPropsLayoutOverrides extends StObject
  
  trait ModalDialogPropsSizeOverrides extends StObject
  
  trait ModalDialogPropsVariantOverrides extends StObject
  
  type ModalDialogSlot = "root"
  
  trait ModalDialogTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Layout
  }
  object ModalDialogTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Layout): ModalDialogTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalDialogTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalDialogTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (ModalDialogTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Layout): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
