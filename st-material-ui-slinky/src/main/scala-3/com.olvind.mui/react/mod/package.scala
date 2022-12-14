package com.olvind.mui.react.mod

import com.olvind.mui.react.anon.UNDEFINEDVOIDONLY
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[SyntheticAnimationEvent[T]]

// All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
type AriaRole = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70, starting with "alert", "alertdialog", "application" */ Any

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

type ClipboardEventHandler[T] = EventHandler[SyntheticClipboardEvent[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
  }}}
  */
type ComponentPropsWithRef[T /* <: slinky.core.facade.ReactElement */] = ComponentProps[T]

type ComponentPropsWithoutRef[T /* <: slinky.core.facade.ReactElement */] = PropsWithoutRef[ComponentProps[T]]

type CompositionEventHandler[T] = EventHandler[SyntheticCompositionEvent[T]]

type DependencyList = js.Array[Any]

// Destructors are only allowed to return void.
type Destructor = js.Function0[Unit | UNDEFINEDVOIDONLY]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

type DragEventHandler[T] = EventHandler[DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
type EffectCallback = js.Function0[Unit | Destructor]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: SyntheticEvent[Event, Any] */] = js.Function1[/* event */ E, Unit]

type FocusEventHandler[T] = EventHandler[SyntheticFocusEvent[T]]

type FormEventHandler[T] = EventHandler[SyntheticEvent[EventTarget & T, Event]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null

type HTMLAttributeAnchorTarget = "_self" | "_blank" | "_parent" | "_top" | String

type HTMLAttributeReferrerPolicy = "" | "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url"

type HTMLInputTypeAttribute = "button" | "checkbox" | "color" | "date" | "datetime-local" | "email" | "file" | "hidden" | "image" | "month" | "number" | "password" | "radio" | "range" | "reset" | "search" | "submit" | "tel" | "text" | "time" | "url" | "week" | String

type JSXElementConstructor[P] = js.Function1[/* props */ P, slinky.core.facade.ReactElement | Null]

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[SyntheticKeyboardEvent[T]]

type LegacyRef[T] = String | Ref[T]

type ModifierKey = "Alt" | "AltGraph" | "CapsLock" | "Control" | "Fn" | "FnLock" | "Hyper" | "Meta" | "NumLock" | "ScrollLock" | "Shift" | "Super" | "Symbol" | "SymbolLock"

type MouseEventHandler[T] = EventHandler[SyntheticMouseEvent[T]]

type PointerEventHandler[T] = EventHandler[SyntheticPointerEvent[T]]

/**
  * {@link https://reactjs.org/docs/profiler.html#onrender-callback Profiler API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ String, 
/* phase */ "mount" | "update", 
/* actualDuration */ Double, 
/* baseDuration */ Double, 
/* startTime */ Double, 
/* commitTime */ Double, 
/* interactions */ Set[Interaction], 
Unit]

/** Ensures that the props do not include ref at all */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Pick would not be sufficient for this. We'd like to avoid unnecessary mapping and need a distributive conditional to support unions.
// see: https://www.typescriptlang.org/docs/handbook/2/conditional-types.html#distributive-conditional-types
// https://github.com/Microsoft/TypeScript/issues/28339
P extends any ? 'ref' extends keyof P ? std.Pick<P, std.Exclude<keyof P, 'ref'>> : P : P
  }}}
  */
type PropsWithoutRef[P] = P

type ReactEventHandler[T] = EventHandler[SyntheticEvent[Event, T]]

type Ref[T] = RefCallback[T] | ReactRef[T] | Null

// Bivariance hack for consistent unsoundness with RefObject
type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

type TouchEventHandler[T] = EventHandler[SyntheticTouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[SyntheticTransitionEvent[T]]

type UIEventHandler[T] = EventHandler[SyntheticUIEvent[T]]

type ValidationMap[T] = com.olvind.mui.propTypes.mod.ValidationMap[T]

type WheelEventHandler[T] = EventHandler[SyntheticWheelEvent[T]]
