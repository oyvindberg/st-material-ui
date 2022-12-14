package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Thickness
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressLinearProgressPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap> extends std.Function ? std.Omit<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap> : {[ K in keyof std.Omit<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap> ]: std.Omit<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap, 'color'> & @mui/joy.anon.61<@mui/joy.anon.LinearProgressPropsLinearProgressTypeMap>[K]} */ trait LinearProgressOwnerState extends StObject {
    
    /**
      * @internal the explicit size on the instance: <LinearProgress size="..." />
      */
    var instanceSize: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", LinearProgressPropsSizeOverrides]] = js.undefined
  }
  object LinearProgressOwnerState {
    
    inline def apply(): LinearProgressOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearProgressOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinearProgressOwnerState] (val x: Self) extends AnyVal {
      
      inline def setInstanceSize(value: OverridableStringUnion["sm" | "md" | "lg", LinearProgressPropsSizeOverrides]): Self = StObject.set(x, "instanceSize", value.asInstanceOf[js.Any])
      
      inline def setInstanceSizeUndefined: Self = StObject.set(x, "instanceSize", js.undefined)
    }
  }
  
  type LinearProgressProps[D /* <: ReactElement */, P] = OverrideProps[LinearProgressTypeMap[P, D], D]
  
  trait LinearProgressPropsColorOverrides extends StObject
  
  trait LinearProgressPropsSizeOverrides extends StObject
  
  trait LinearProgressPropsVariantOverrides extends StObject
  
  type LinearProgressSlot = "root"
  
  trait LinearProgressTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Thickness
  }
  object LinearProgressTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Thickness): LinearProgressTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearProgressTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinearProgressTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (LinearProgressTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Thickness): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
