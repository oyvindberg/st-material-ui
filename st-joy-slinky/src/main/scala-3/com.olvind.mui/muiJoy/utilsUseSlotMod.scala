package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ClassNameOwnerState
import com.olvind.mui.muiJoy.anon.ComponentRef
import com.olvind.mui.muiJoy.anon.GetSlotOwnerState
import com.olvind.mui.muiJoy.anon.Ref
import com.olvind.mui.react.mod.EventHandler
import com.olvind.mui.std.Exclude
import com.olvind.mui.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUseSlotMod {
  
  @JSImport("@mui/joy/utils/useSlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.annotation.targetName("default_root")
  inline def default[T /* <: String */, ElementType /* <: ReactElement */, SlotProps, OwnerState /* <: js.Object */, ExternalSlotProps /* <: ComponentRef */, ExternalForwardedProps /* <: com.olvind.mui.muiJoy.anon.SlotProps[T, ExternalSlotProps, OwnerState] */, AdditionalProps, SlotOwnerState /* <: js.Object */](
    /**
    * The slot's name. All Joy UI components should have `root` slot.
    *
    * If the name is `root`, the logic behaves differently from other slots,
    * e.g. the `externalForwardedProps` are spread to `root` slot but not other slots.
    */
  name: T,
    parameters: (/* import warning: importer.ImportType#apply Failed type conversion: T extends 'root' ? {  ref :react.react.ForwardedRef<any>} : {  ref :react.react.ForwardedRef<any> | undefined} */ js.Any) & (GetSlotOwnerState[
      ElementType, 
      OwnerState, 
      ExternalForwardedProps, 
      SlotProps, 
      AdditionalProps, 
      ExternalSlotProps, 
      T, 
      SlotOwnerState
    ])
  ): js.Tuple2[
    ElementType, 
    (ClassNameOwnerState[OwnerState, SlotOwnerState]) & AdditionalProps & SlotProps & ExternalSlotProps & (ExtractComponentProps[
      Exclude[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<ExternalForwardedProps['slotProps'], undefined>[T] */ js.Any, 
        Unit
      ]
    ])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    ElementType, 
    (ClassNameOwnerState[OwnerState, SlotOwnerState]) & AdditionalProps & SlotProps & ExternalSlotProps & (ExtractComponentProps[
      Exclude[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<ExternalForwardedProps['slotProps'], undefined>[T] */ js.Any, 
        Unit
      ]
    ])
  ]]
  
  type EventHandlers = Record[String, EventHandler[Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    P extends infer T | (ownerState : any): infer T ? T : never
    }}}
    */
  @js.native
  trait ExtractComponentProps[P] extends StObject
  
  type WithCommonProps[T] = T & Ref
}
