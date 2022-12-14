package com.olvind.mui.react.mod

import com.olvind.mui.react.anon.UNDEFINEDVOIDONLY
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Set
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[ReactAnimationEventFrom[T & Element]]

// All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
type AriaRole = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70, starting with "alert", "alertdialog", "application" */ Any

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type ClipboardEventHandler[T] = EventHandler[ReactClipboardEventFrom[T & Element]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
  }}}
  */
type ComponentPropsWithRef[T /* <: ElementType */] = ComponentProps[T]

type ComponentPropsWithoutRef[T /* <: ElementType */] = PropsWithoutRef[ComponentProps[T]]

type ComponentType[P] = (ComponentClassP[P & js.Object]) | FunctionComponent[P]

type CompositionEventHandler[T] = EventHandler[ReactCompositionEventFrom[T & Element]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

type DependencyList = js.Array[Any]

// Destructors are only allowed to return void.
type Destructor = js.Function0[Unit | UNDEFINEDVOIDONLY]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

type DragEventHandler[T] = EventHandler[ReactDragEventFrom[T & Element]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
type EffectCallback = js.Function0[Unit | Destructor]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: ReactEventFrom[Any & Element] */] = js.Function1[/* event */ E, Unit]

//
// Class Interfaces
// ----------------------------------------------------------------------
type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[ReactFocusEventFrom[T & Element]]

type FormEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null

type HTMLAttributeAnchorTarget = "_self" | "_blank" | "_parent" | "_top" | String

type HTMLAttributeReferrerPolicy = "" | "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url"

type HTMLInputTypeAttribute = "button" | "checkbox" | "color" | "date" | "datetime-local" | "email" | "file" | "hidden" | "image" | "month" | "number" | "password" | "radio" | "range" | "reset" | "search" | "submit" | "tel" | "text" | "time" | "url" | "week" | String

type JSXElementConstructor[P] = js.Function1[/* props */ P, japgolly.scalajs.react.facade.React.Element | Null]

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[ReactKeyboardEventFrom[T & Element]]

type LegacyRef[T] = String | Ref[T]

type MouseEventHandler[T] = EventHandler[ReactMouseEventFrom[T & Element]]

type PointerEventHandler[T] = EventHandler[ReactPointerEventFrom[T & Element]]

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

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

type ReactEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type Ref[T] = RefFn[T] | RefHandle[T] | Null

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

type TouchEventHandler[T] = EventHandler[ReactTouchEventFrom[T & Element]]

type TransitionEventHandler[T] = EventHandler[ReactTransitionEventFrom[T & Element]]

type UIEventHandler[T] = EventHandler[ReactUIEventFrom[T & Element]]

type ValidationMap[T] = com.olvind.mui.propTypes.mod.ValidationMap[T]

type WheelEventHandler[T] = EventHandler[ReactWheelEventFrom[T & Element]]
