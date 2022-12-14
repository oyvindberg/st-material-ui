package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.ComponentPropsWithRef
import com.olvind.mui.std.Partial
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  type SlotComponentProps[TSlotComponent /* <: ElementType */, TOverrides, TOwnerState] = (Partial[ComponentPropsWithRef[TSlotComponent]] & TOverrides) | (js.Function1[
    /* ownerState */ TOwnerState, 
    Partial[ComponentPropsWithRef[TSlotComponent]] & TOverrides
  ])
}
