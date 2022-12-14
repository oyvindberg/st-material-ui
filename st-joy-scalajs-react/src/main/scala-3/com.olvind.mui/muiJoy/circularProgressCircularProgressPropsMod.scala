package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Determinate
import com.olvind.mui.muiJoy.anon.Svg
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressCircularProgressPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.CircularProgressPropsCircularProgressTyp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CircularProgressPropsCircularProgressTyp> extends std.Function ? std.Omit<@mui/joy.anon.CircularProgressPropsCircularProgressTyp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CircularProgressPropsCircularProgressTyp> : {[ K in keyof std.Omit<@mui/joy.anon.CircularProgressPropsCircularProgressTyp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CircularProgressPropsCircularProgressTyp> ]: std.Omit<@mui/joy.anon.CircularProgressPropsCircularProgressTyp, 'color'> & @mui/joy.anon.61<@mui/joy.anon.CircularProgressPropsCircularProgressTyp>[K]} */ trait CircularProgressOwnerState extends StObject {
    
    /**
      * @internal the explicit size on the instance: <CircularProgress size="..." />
      */
    var instanceSize: js.UndefOr[OverridableStringUnion["sm" | "md" | "lg", CircularProgressPropsSizeOverrides]] = js.undefined
  }
  object CircularProgressOwnerState {
    
    inline def apply(): CircularProgressOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularProgressOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularProgressOwnerState] (val x: Self) extends AnyVal {
      
      inline def setInstanceSize(value: OverridableStringUnion["sm" | "md" | "lg", CircularProgressPropsSizeOverrides]): Self = StObject.set(x, "instanceSize", value.asInstanceOf[js.Any])
      
      inline def setInstanceSizeUndefined: Self = StObject.set(x, "instanceSize", js.undefined)
    }
  }
  
  type CircularProgressProps[D /* <: ElementType */, P] = OverrideProps[CircularProgressTypeMap[P, D], D]
  
  trait CircularProgressPropsColorOverrides extends StObject
  
  trait CircularProgressPropsSizeOverrides extends StObject
  
  trait CircularProgressPropsVariantOverrides extends StObject
  
  object CircularProgressSlot {
    
    inline def progress: "progress" = "progress".asInstanceOf["progress"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def svg: "svg" = "svg".asInstanceOf["svg"]
    
    inline def track: "track" = "track".asInstanceOf["track"]
  }
  type CircularProgressSlot = "root" | "svg" | "track" | "progress"
  
  trait CircularProgressSlots extends StObject {
    
    /**
      * The component that renders the progress.
      * @default 'circle'
      */
    var progress: ElementType
    
    /**
      * The component that renders the root.
      * @default 'span'
      */
    var root: ElementType
    
    /**
      * The component that renders the svg.
      * @default 'svg'
      */
    var svg: ElementType
    
    /**
      * The component that renders the track.
      * @default 'circle'
      */
    var track: ElementType
  }
  object CircularProgressSlots {
    
    inline def apply(progress: ElementType, root: ElementType, svg: ElementType, track: ElementType): CircularProgressSlots = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularProgressSlots] (val x: Self) extends AnyVal {
      
      inline def setProgress(value: ElementType): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: ElementType): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  type CircularProgressSlotsAndSlotProps = CreateSlotsAndSlotProps[CircularProgressSlots, Svg]
  
  trait CircularProgressTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & CircularProgressSlotsAndSlotProps & Determinate
  }
  object CircularProgressTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & CircularProgressSlotsAndSlotProps & Determinate): CircularProgressTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircularProgressTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (CircularProgressTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & CircularProgressSlotsAndSlotProps & Determinate): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
