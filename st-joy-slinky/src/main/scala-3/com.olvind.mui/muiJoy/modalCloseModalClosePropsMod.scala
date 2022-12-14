package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorSize
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalCloseModalClosePropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde> extends std.Function ? std.Omit<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde> : {[ K in keyof std.Omit<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde> ]: std.Omit<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ModalClosePropsModalCloseTypeMapbuttonde>[K]} */ trait ModalCloseOwnerState extends StObject {
    
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ModalCloseOwnerState {
    
    inline def apply(): ModalCloseOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalCloseOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalCloseOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type ModalCloseProps[D /* <: ReactElement */, P] = OverrideProps[ModalCloseTypeMap[P, D], D]
  
  trait ModalClosePropsColorOverrides extends StObject
  
  trait ModalClosePropsSizeOverrides extends StObject
  
  trait ModalClosePropsVariantOverrides extends StObject
  
  type ModalCloseSlot = "root"
  
  trait ModalCloseTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ColorSize
  }
  object ModalCloseTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ColorSize): ModalCloseTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalCloseTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalCloseTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ModalCloseTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ColorSize): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
