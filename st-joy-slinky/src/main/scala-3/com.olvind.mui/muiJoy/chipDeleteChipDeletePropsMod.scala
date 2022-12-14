package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OnDelete
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipDeleteChipDeletePropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde> extends std.Function ? std.Omit<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde> : {[ K in keyof std.Omit<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde> ]: std.Omit<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde, 'color'> & @mui/joy.anon.61<@mui/joy.anon.ChipDeletePropsChipDeleteTypeMapbuttonde>[K]} */ trait ChipDeleteOwnerState extends StObject {
    
    /**
      * If `true`, the element's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ChipDeleteOwnerState {
    
    inline def apply(): ChipDeleteOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChipDeleteOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipDeleteOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type ChipDeleteProps[D /* <: ReactElement */, P] = OverrideProps[ChipDeleteTypeMap[P, D], D]
  
  trait ChipDeletePropsColorOverrides extends StObject
  
  trait ChipDeletePropsVariantOverrides extends StObject
  
  type ChipDeleteSlot = "root"
  
  trait ChipDeleteTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & OnDelete
  }
  object ChipDeleteTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & OnDelete): ChipDeleteTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipDeleteTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipDeleteTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ChipDeleteTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OnDelete): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
