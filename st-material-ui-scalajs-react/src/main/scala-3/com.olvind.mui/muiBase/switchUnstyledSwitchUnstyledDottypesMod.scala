package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.SwitchUnstyledOwnProps
import com.olvind.mui.muiTypes.mod.Simplify
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchUnstyledSwitchUnstyledDottypesMod {
  
  trait SwitchUnstyledInputSlotPropsOverrides extends StObject
  
  type SwitchUnstyledOwnerState = Simplify[SwitchUnstyledOwnProps]
  
  trait SwitchUnstyledRootSlotPropsOverrides extends StObject
  
  trait SwitchUnstyledSlots extends StObject {
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The component that renders the root.
      * @default 'span'
      */
    var root: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The component that renders the thumb.
      * @default 'span'
      */
    var thumb: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The component that renders the track.
      * @default 'span'
      */
    var track: js.UndefOr[ElementType | Null] = js.undefined
  }
  object SwitchUnstyledSlots {
    
    inline def apply(): SwitchUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setThumb(value: ElementType): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      inline def setTrack(value: ElementType): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackNull: Self = StObject.set(x, "track", null)
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  trait SwitchUnstyledThumbSlotPropsOverrides extends StObject
  
  trait SwitchUnstyledTrackSlotPropsOverrides extends StObject
}
