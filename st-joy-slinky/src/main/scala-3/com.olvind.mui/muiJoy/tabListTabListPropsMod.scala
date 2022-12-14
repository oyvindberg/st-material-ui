package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.SizeSx
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListTabListPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp> extends std.Function ? std.Omit<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp> : {[ K in keyof std.Omit<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp> ]: std.Omit<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.TabListPropsTabListTypeMapdivdefaultComp>[K]} */ trait TabListOwnerState extends StObject {
    
    /**
      * If `true`, the Tabs' direction is "rtl".
      */
    var isRtl: Boolean
    
    /**
      * The orientation of the Tabs.
      */
    var orientation: "horizontal" | "vertical"
  }
  object TabListOwnerState {
    
    inline def apply(isRtl: Boolean, orientation: "horizontal" | "vertical"): TabListOwnerState = {
      val __obj = js.Dynamic.literal(isRtl = isRtl.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabListOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabListOwnerState] (val x: Self) extends AnyVal {
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
  
  type TabListProps[D /* <: ReactElement */, P] = OverrideProps[TabListTypeMap[P, D], D]
  
  trait TabListPropsColorOverrides extends StObject
  
  trait TabListPropsSizeOverrides extends StObject
  
  trait TabListPropsVariantOverrides extends StObject
  
  type TabListSlot = "root"
  
  trait TabListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SizeSx
  }
  object TabListTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & SizeSx): TabListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabListTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TabListTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SizeSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
