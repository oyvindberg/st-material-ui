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
import org.scalablytyped.runtime.TopLevel
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

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

type ClipboardEventHandler[T] = EventHandler[SyntheticClipboardEvent[T]]

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)

type ComponentPropsWithRef[T /* <: slinky.core.facade.ReactElement */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[Any] & RefAttributes[InstanceType[T]])

type CompositionEventHandler[T] = EventHandler[SyntheticCompositionEvent[T]]

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

type DragEventHandler[T] = EventHandler[DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
type EffectCallback = js.Function0[Unit | Destructor]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: SyntheticEvent[Event, Any] */] = js.Function1[/* event */ E, Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

type FocusEventHandler[T] = EventHandler[SyntheticFocusEvent[T]]

type FormEventHandler[T] = EventHandler[SyntheticEvent[EventTarget & T, Event]]

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

type JSXElementConstructor[P] = js.Function1[/* props */ P, slinky.core.facade.ReactElement | Null]

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[SyntheticKeyboardEvent[T]]

type LegacyRef[T] = String | Ref[T]

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
type MergePropTypes[P, T] = ((Pick[P, NotExactlyAnyPropertyKeys[P]]) & (Pick[T, Exclude[/* keyof T */ String, NotExactlyAnyPropertyKeys[P]]]) & (Pick[P, Exclude[/* keyof P */ String, /* keyof T */ String]])) | P | T

type MouseEventHandler[T] = EventHandler[SyntheticMouseEvent[T]]

type NotExactlyAnyPropertyKeys[T] = Exclude[/* keyof T */ String, ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = EventHandler[SyntheticPointerEvent[T]]

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

type ReactEventHandler[T] = EventHandler[SyntheticEvent[Event, T]]

type ReactManagedAttributes[C, P] = P | (Defaultize[(MergePropTypes[P, InferProps[Any]]) | P, Any]) | (MergePropTypes[P, InferProps[Any]])

type Ref[T] = RefCallback[T] | ReactRef[T] | Null

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

type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? null extends T[K]? react.react.Validator<T[K] | null | undefined> : undefined extends T[K]? react.react.Validator<T[K] | null | undefined> : react.react.Validator<T[K]>}
  */ com.olvind.mui.react.reactStrings.WeakValidationMap & TopLevel[Any]

type WheelEventHandler[T] = EventHandler[SyntheticWheelEvent[T]]
