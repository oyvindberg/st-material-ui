package com.olvind.mui.react.mod

import com.olvind.mui.propTypes.mod.InferProps
import com.olvind.mui.react.anon.Children
import com.olvind.mui.react.anon.UNDEFINEDVOIDONLY
import com.olvind.mui.react.anon.`1`
import com.olvind.mui.react.reactStrings.mount
import com.olvind.mui.react.reactStrings.ref
import com.olvind.mui.react.reactStrings.update
import com.olvind.mui.scheduler.tracingMod.Interaction
import com.olvind.mui.std.Exclude
import com.olvind.mui.std.Extract
import com.olvind.mui.std.InstanceType
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Pick
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
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[ReactAnimationEventFrom[T & Element]]

// All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
/* Rewritten from type alias, can be one of: 
  - `com.olvind.mui`.react.reactStrings.alert
  - `com.olvind.mui`.react.reactStrings.alertdialog
  - `com.olvind.mui`.react.reactStrings.application
  - `com.olvind.mui`.react.reactStrings.article
  - `com.olvind.mui`.react.reactStrings.banner
  - `com.olvind.mui`.react.reactStrings.button
  - `com.olvind.mui`.react.reactStrings.cell
  - `com.olvind.mui`.react.reactStrings.checkbox
  - `com.olvind.mui`.react.reactStrings.columnheader
  - `com.olvind.mui`.react.reactStrings.combobox
  - `com.olvind.mui`.react.reactStrings.complementary
  - `com.olvind.mui`.react.reactStrings.contentinfo
  - `com.olvind.mui`.react.reactStrings.definition
  - `com.olvind.mui`.react.reactStrings.dialog
  - `com.olvind.mui`.react.reactStrings.directory
  - `com.olvind.mui`.react.reactStrings.document
  - `com.olvind.mui`.react.reactStrings.feed
  - `com.olvind.mui`.react.reactStrings.figure
  - `com.olvind.mui`.react.reactStrings.form
  - `com.olvind.mui`.react.reactStrings.grid
  - `com.olvind.mui`.react.reactStrings.gridcell
  - `com.olvind.mui`.react.reactStrings.group
  - `com.olvind.mui`.react.reactStrings.heading
  - `com.olvind.mui`.react.reactStrings.img
  - `com.olvind.mui`.react.reactStrings.link
  - `com.olvind.mui`.react.reactStrings.list
  - `com.olvind.mui`.react.reactStrings.listbox
  - `com.olvind.mui`.react.reactStrings.listitem
  - `com.olvind.mui`.react.reactStrings.log
  - `com.olvind.mui`.react.reactStrings.main
  - `com.olvind.mui`.react.reactStrings.marquee
  - `com.olvind.mui`.react.reactStrings.math
  - `com.olvind.mui`.react.reactStrings.menu
  - `com.olvind.mui`.react.reactStrings.menubar
  - `com.olvind.mui`.react.reactStrings.menuitem
  - `com.olvind.mui`.react.reactStrings.menuitemcheckbox
  - `com.olvind.mui`.react.reactStrings.menuitemradio
  - `com.olvind.mui`.react.reactStrings.navigation
  - `com.olvind.mui`.react.reactStrings.none
  - `com.olvind.mui`.react.reactStrings.note
  - `com.olvind.mui`.react.reactStrings.option
  - `com.olvind.mui`.react.reactStrings.presentation
  - `com.olvind.mui`.react.reactStrings.progressbar
  - `com.olvind.mui`.react.reactStrings.radio
  - `com.olvind.mui`.react.reactStrings.radiogroup
  - `com.olvind.mui`.react.reactStrings.region
  - `com.olvind.mui`.react.reactStrings.row
  - `com.olvind.mui`.react.reactStrings.rowgroup
  - `com.olvind.mui`.react.reactStrings.rowheader
  - `com.olvind.mui`.react.reactStrings.scrollbar
  - `com.olvind.mui`.react.reactStrings.search
  - `com.olvind.mui`.react.reactStrings.searchbox
  - `com.olvind.mui`.react.reactStrings.separator
  - `com.olvind.mui`.react.reactStrings.slider
  - `com.olvind.mui`.react.reactStrings.spinbutton
  - `com.olvind.mui`.react.reactStrings.status
  - `com.olvind.mui`.react.reactStrings.switch
  - `com.olvind.mui`.react.reactStrings.tab
  - `com.olvind.mui`.react.reactStrings.table
  - `com.olvind.mui`.react.reactStrings.tablist
  - `com.olvind.mui`.react.reactStrings.tabpanel
  - `com.olvind.mui`.react.reactStrings.term
  - `com.olvind.mui`.react.reactStrings.textbox
  - `com.olvind.mui`.react.reactStrings.timer
  - `com.olvind.mui`.react.reactStrings.toolbar
  - `com.olvind.mui`.react.reactStrings.tooltip
  - `com.olvind.mui`.react.reactStrings.tree
  - `com.olvind.mui`.react.reactStrings.treegrid
  - `com.olvind.mui`.react.reactStrings.treeitem
  - java.lang.String
*/
type AriaRole = _AriaRole | String

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type ClipboardEventHandler[T] = EventHandler[ReactClipboardEventFrom[T & Element]]

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)

type ComponentPropsWithRef[T /* <: ElementType */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[Any] & RefAttributes[InstanceType[T]])

type CompositionEventHandler[T] = EventHandler[ReactCompositionEventFrom[T & Element]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
type Defaultize[P, D] = ((Pick[P, Exclude[/* keyof P */ String, /* keyof D */ String]]) & (Partial[Pick[P, Extract[/* keyof P */ String, /* keyof D */ String]]]) & (Partial[Pick[D, Exclude[/* keyof D */ String, /* keyof P */ String]]])) | P

// TODO (TypeScript 3.0): ReadonlyArray<unknown>
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

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[ReactFocusEventFrom[T & Element]]

type FormEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type ForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null

/* Rewritten from type alias, can be one of: 
  - `com.olvind.mui`.react.reactStrings._self
  - `com.olvind.mui`.react.reactStrings._blank
  - `com.olvind.mui`.react.reactStrings._parent
  - `com.olvind.mui`.react.reactStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

/* Rewritten from type alias, can be one of: 
  - `com.olvind.mui`.react.reactStrings.button
  - `com.olvind.mui`.react.reactStrings.checkbox
  - `com.olvind.mui`.react.reactStrings.color
  - `com.olvind.mui`.react.reactStrings.date
  - `com.olvind.mui`.react.reactStrings.`datetime-local`
  - `com.olvind.mui`.react.reactStrings.email
  - `com.olvind.mui`.react.reactStrings.file
  - `com.olvind.mui`.react.reactStrings.hidden
  - `com.olvind.mui`.react.reactStrings.image
  - `com.olvind.mui`.react.reactStrings.month
  - `com.olvind.mui`.react.reactStrings.number
  - `com.olvind.mui`.react.reactStrings.password
  - `com.olvind.mui`.react.reactStrings.radio
  - `com.olvind.mui`.react.reactStrings.range
  - `com.olvind.mui`.react.reactStrings.reset
  - `com.olvind.mui`.react.reactStrings.search
  - `com.olvind.mui`.react.reactStrings.submit
  - `com.olvind.mui`.react.reactStrings.tel
  - `com.olvind.mui`.react.reactStrings.text
  - `com.olvind.mui`.react.reactStrings.time
  - `com.olvind.mui`.react.reactStrings.url
  - `com.olvind.mui`.react.reactStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

type JSXElementConstructor[P] = js.Function1[/* props */ P, japgolly.scalajs.react.facade.React.Element | Null]

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[ReactKeyboardEventFrom[T & Element]]

type LegacyRef[T] = String | Ref[T]

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
type MergePropTypes[P, T] = ((Pick[P, NotExactlyAnyPropertyKeys[P]]) & (Pick[T, Exclude[/* keyof T */ String, NotExactlyAnyPropertyKeys[P]]]) & (Pick[P, Exclude[/* keyof P */ String, /* keyof T */ String]])) | P | T

type MouseEventHandler[T] = EventHandler[ReactMouseEventFrom[T & Element]]

type NotExactlyAnyPropertyKeys[T] = Exclude[/* keyof T */ String, ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = EventHandler[ReactPointerEventFrom[T & Element]]

/**
  * {@link https://reactjs.org/docs/profiler.html#onrender-callback Profiler API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ String, 
/* phase */ mount | update, 
/* actualDuration */ Double, 
/* baseDuration */ Double, 
/* startTime */ Double, 
/* commitTime */ Double, 
/* interactions */ Set[Interaction], 
Unit]

type PropsWithChildren[P] = P & Children

/** Ensures that the props do not include string ref, which cannot be forwarded */
type PropsWithRef[P] = P | (PropsWithoutRef[P] & `1`)

/** Ensures that the props do not include ref at all */
type PropsWithoutRef[P] = P | (Pick[P, Exclude[/* keyof P */ String, ref]])

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

type ReactEventHandler[T] = EventHandler[ReactEventFrom[T & Element]]

type ReactManagedAttributes[C, P] = P | (Defaultize[(MergePropTypes[P, InferProps[Any]]) | P, Any]) | (MergePropTypes[P, InferProps[Any]])

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

type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? null extends T[K]? react.react.Validator<T[K] | null | undefined> : undefined extends T[K]? react.react.Validator<T[K] | null | undefined> : react.react.Validator<T[K]>}
  */ com.olvind.mui.react.reactStrings.WeakValidationMap & TopLevel[Any]

type WheelEventHandler[T] = EventHandler[ReactWheelEventFrom[T & Element]]
