package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  type SlotComponentProps[TSlotComponent /* <: ReactElement */, TOverrides, TOwnerState] = (Partial[ComponentPropsWithRef[TSlotComponent]] & TOverrides) | (js.Function1[
    /* ownerState */ TOwnerState, 
    Partial[ComponentPropsWithRef[TSlotComponent]] & TOverrides
  ])
}
