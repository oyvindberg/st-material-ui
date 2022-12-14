package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.useSwitchUseSwitchDottypesMod.UseSwitchParameters
import com.olvind.mui.muiJoy.anon.ColorEndDecorator
import com.olvind.mui.muiJoy.anon.Track
import com.olvind.mui.muiJoy.utilsTypesMod.CreateSlotsAndSlotProps
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchPropsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Omit<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon> extends std.Function ? std.Omit<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon> : {[ K in keyof std.Omit<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon> ]: std.Omit<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon, 'color'> & @mui/joy.anon.61<@mui/joy.anon.SwitchPropsSwitchTypeMapdivdefaultCompon>[K]} */ trait SwitchOwnerState extends StObject {
    
    /**
      * If `true`, the switch's focus is visible.
      */
    var focusVisible: js.UndefOr[Boolean] = js.undefined
  }
  object SwitchOwnerState {
    
    inline def apply(): SwitchOwnerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchOwnerState] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    }
  }
  
  type SwitchProps[D /* <: ReactElement */, P] = OverrideProps[SwitchTypeMap[P, D], D]
  
  trait SwitchPropsColorOverrides extends StObject
  
  trait SwitchPropsSizeOverrides extends StObject
  
  trait SwitchPropsVariantOverrides extends StObject
  
  object SwitchSlot {
    
    inline def action: "action" = "action".asInstanceOf["action"]
    
    inline def endDecorator: "endDecorator" = "endDecorator".asInstanceOf["endDecorator"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def startDecorator: "startDecorator" = "startDecorator".asInstanceOf["startDecorator"]
    
    inline def thumb: "thumb" = "thumb".asInstanceOf["thumb"]
    
    inline def track: "track" = "track".asInstanceOf["track"]
  }
  type SwitchSlot = "root" | "action" | "input" | "track" | "thumb" | "startDecorator" | "endDecorator"
  
  trait SwitchSlots extends StObject {
    
    /**
      * The component that renders the action.
      * @default 'div'
      */
    var action: ReactElement
    
    /**
      * The component that renders the end decorator.
      * @default 'span'
      */
    var endDecorator: ReactElement
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: ReactElement
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: ReactElement
    
    /**
      * The component that renders the start decorator.
      * @default 'span'
      */
    var startDecorator: ReactElement
    
    /**
      * The component that renders the thumb.
      * @default 'span'
      */
    var thumb: ReactElement
    
    /**
      * The component that renders the track.
      * @default 'span'
      */
    var track: ReactElement
  }
  object SwitchSlots {
    
    inline def apply(
      action: ReactElement,
      endDecorator: ReactElement,
      input: ReactElement,
      root: ReactElement,
      startDecorator: ReactElement,
      thumb: ReactElement,
      track: ReactElement
    ): SwitchSlots = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchSlots] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ReactElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: ReactElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  type SwitchSlotsAndSlotProps = CreateSlotsAndSlotProps[SwitchSlots, Track]
  
  trait SwitchTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SwitchSlotsAndSlotProps & UseSwitchParameters & ColorEndDecorator
  }
  object SwitchTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & SwitchSlotsAndSlotProps & UseSwitchParameters & ColorEndDecorator): SwitchTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (SwitchTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SwitchSlotsAndSlotProps & UseSwitchParameters & ColorEndDecorator): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
