package com.olvind.mui.react.mod

import com.olvind.mui.react.anon.Children
import com.olvind.mui.react.anon.UNDEFINEDVOIDONLY
import com.olvind.mui.react.mod.^
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
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useCallback
  */
// A specific function type would not trigger implicit any.
// See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
// tslint:disable-next-line ban-types
inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `React.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useContext
  */
inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
  *
  * NOTE: We don’t recommend adding debug values to every custom hook.
  * It’s most valuable for custom hooks that are part of shared libraries.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useDebugValue
  */
// the name of the custom hook is itself derived from the function name at runtime:
// it's just the function name without the "use" prefix.
inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useEffect
  */
inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]

// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `React.forwardRef`.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useImperativeHandle
  */
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
  * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
  * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
  *
  * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
  *
  * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
  * `componentDidMount` and `componentDidUpdate`.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useLayoutEffect
  */
inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useMemo
  */
// allow undefined, but don't make it optional as that is very likely a mistake
inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
// The Flow types do have an overload for 3-ary invocation with undefined initializer.
// NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
// supertype between the reducer's return type and the initialState (or the initializer's return type),
// which would prevent autocompletion from ever working.
// TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
// in older versions, or a regression in newer versions of the typescript completion service.
inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// overload where dispatch could accept 0 arguments.
inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useReducer
  */
// overload where dispatch could accept 0 arguments.
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
inline def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
  reducer: R,
  initializerArg: (I & ReducerState[R]) | I,
  initializer: js.Function1[
  (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
  ReducerState[R] | ReducerStateWithoutAction[R]
]
): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]

// convenience overload for refs given as a ref prop as they typically start with a null value
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
  * of the generic argument.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useRef
  */
inline def useRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefHandle[T]]
inline def useRef[T](initialValue: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]

// convenience overload when first argument is omitted
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useState
  */
inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useState
  */
inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
inline def useSyncExternalStore[Snapshot](
  subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
  getSnapshot: js.Function0[Snapshot],
  getServerSnapshot: js.Function0[Snapshot]
): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]

inline def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]

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

// Since action _can_ be undefined, dispatch may be called without any parameters.
type DispatchWithoutAction = js.Function0[Unit]

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

type ModifierKey = "Alt" | "AltGraph" | "CapsLock" | "Control" | "Fn" | "FnLock" | "Hyper" | "Meta" | "NumLock" | "ScrollLock" | "Shift" | "Super" | "Symbol" | "SymbolLock"

type MouseEventHandler[T] = EventHandler[ReactMouseEventFrom[T & Element]]

type NativeKeyboardEvent = KeyboardEvent

type PointerEventHandler[T] = EventHandler[ReactPointerEventFrom[T & Element]]

/**
  * {@link https://react.dev/reference/react/Profiler#onrender-callback Profiler API}
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

type PropsWithChildren[P] = P & Children

/** Ensures that the props do not include ref at all */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  // Omit would not be sufficient for this. We'd like to avoid unnecessary mapping and need a distributive conditional to support unions.
// see: https://www.typescriptlang.org/docs/handbook/2/conditional-types.html#distributive-conditional-types
// https://github.com/Microsoft/TypeScript/issues/28339
P extends any ? 'ref' extends keyof P ? std.Omit<P, 'ref'> : P : P
  }}}
  */
type PropsWithoutRef[P] = P

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

type ReactEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

// If useReducer accepts a reducer without action, dispatch may be called without any parameters.
type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]

type Ref[T] = RefFn[T] | RefHandle[T] | Null

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

type TouchEventHandler[T] = EventHandler[ReactTouchEventFrom[T & Element]]

type TransitionEventHandler[T] = EventHandler[ReactTransitionEventFrom[T & Element]]

type TransitionFunction = js.Function0[VoidOrUndefinedOnly]

type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]

type UIEventHandler[T] = EventHandler[ReactUIEventFrom[T & Element]]

type ValidationMap[T] = com.olvind.mui.propTypes.mod.ValidationMap[T]

type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY

type WheelEventHandler[T] = EventHandler[ReactWheelEventFrom[T & Element]]
