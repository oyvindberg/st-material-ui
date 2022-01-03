package com.olvind.mui.react

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactAnimationEventFrom[T with org.scalajs.dom.Element]]
  
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
  type AriaRole = com.olvind.mui.react.mod._AriaRole | java.lang.String
  
  type AudioHTMLAttributes[T] = com.olvind.mui.react.mod.MediaHTMLAttributes[T]
  
  type Booleanish = scala.Boolean
  
  type ChangeEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactEventFrom[T with org.scalajs.dom.Element]]
  
  type ClipboardEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactClipboardEventFrom[T with org.scalajs.dom.Element]]
  
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ scala.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  type ComponentPropsWithRef[T /* <: japgolly.scalajs.react.facade.React.ElementType */] = com.olvind.mui.react.mod.PropsWithRef[com.olvind.mui.react.mod.ComponentProps[T]] | (com.olvind.mui.react.mod.PropsWithoutRef[scala.Any] with com.olvind.mui.react.mod.RefAttributes[com.olvind.mui.std.InstanceType[T]])
  
  type CompositionEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactCompositionEventFrom[T with org.scalajs.dom.Element]]
  
  type Consumer[T] = com.olvind.mui.react.mod.ExoticComponent[com.olvind.mui.react.mod.ConsumerProps[T]]
  
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((com.olvind.mui.std.Pick[
    P, 
    com.olvind.mui.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (com.olvind.mui.std.Partial[
    com.olvind.mui.std.Pick[
      P, 
      com.olvind.mui.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (com.olvind.mui.std.Partial[
    com.olvind.mui.std.Pick[
      D, 
      com.olvind.mui.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[scala.Any]
  
  // Destructors are only allowed to return void.
  type Destructor = js.Function0[scala.Unit | com.olvind.mui.react.anon.UNDEFINEDVOIDONLY]
  
  type DetailedHTMLProps[E /* <: com.olvind.mui.react.mod.HTMLAttributes[T] */, T] = com.olvind.mui.react.mod.ClassAttributes[T] with E
  
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  
  type DragEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactDragEventFrom[T with org.scalajs.dom.Element]]
  
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  type EffectCallback = js.Function0[scala.Unit | com.olvind.mui.react.mod.Destructor]
  
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: japgolly.scalajs.react.ReactEventFrom[scala.Any with org.scalajs.dom.Element] */] = js.Function1[/* event */ E, scala.Unit]
  
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  
  type FC[P] = com.olvind.mui.react.mod.FunctionComponent[P]
  
  type FocusEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactFocusEventFrom[T with org.scalajs.dom.Element]]
  
  type FormEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactEventFrom[T with org.scalajs.dom.Element]]
  
  type ForwardedRef[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | (com.olvind.mui.react.mod.MutableRefObject[T | scala.Null]) | scala.Null
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.react.reactStrings._self
    - `com.olvind.mui`.react.reactStrings._blank
    - `com.olvind.mui`.react.reactStrings._parent
    - `com.olvind.mui`.react.reactStrings._top
    - java.lang.String
  */
  type HTMLAttributeAnchorTarget = com.olvind.mui.react.mod._HTMLAttributeAnchorTarget | java.lang.String
  
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
  type HTMLInputTypeAttribute = com.olvind.mui.react.mod._HTMLInputTypeAttribute | java.lang.String
  
  type JSXElementConstructor[P] = js.Function1[/* props */ P, japgolly.scalajs.react.facade.React.Element | scala.Null]
  
  type Key = java.lang.String | scala.Double
  
  type KeyboardEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactKeyboardEventFrom[T with org.scalajs.dom.Element]]
  
  type LegacyRef[T] = java.lang.String | com.olvind.mui.react.mod.Ref[T]
  
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  type MergePropTypes[P, T] = ((com.olvind.mui.std.Pick[P, com.olvind.mui.react.mod.NotExactlyAnyPropertyKeys[P]]) with (com.olvind.mui.std.Pick[
    T, 
    com.olvind.mui.std.Exclude[
      /* keyof T */ java.lang.String, 
      com.olvind.mui.react.mod.NotExactlyAnyPropertyKeys[P]
    ]
  ]) with (com.olvind.mui.std.Pick[
    P, 
    com.olvind.mui.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]
  ])) | P | T
  
  type MouseEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactMouseEventFrom[T with org.scalajs.dom.Element]]
  
  type NotExactlyAnyPropertyKeys[T] = com.olvind.mui.std.Exclude[/* keyof T */ java.lang.String, com.olvind.mui.react.mod.ExactlyAnyPropertyKeys[T]]
  
  type PointerEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactPointerEventFrom[T with org.scalajs.dom.Element]]
  
  /**
    * {@link https://reactjs.org/docs/profiler.html#onrender-callback Profiler API}
    */
  type ProfilerOnRenderCallback = js.Function7[
    /* id */ java.lang.String, 
    /* phase */ com.olvind.mui.react.reactStrings.mount | com.olvind.mui.react.reactStrings.update, 
    /* actualDuration */ scala.Double, 
    /* baseDuration */ scala.Double, 
    /* startTime */ scala.Double, 
    /* commitTime */ scala.Double, 
    /* interactions */ com.olvind.mui.std.Set[com.olvind.mui.scheduler.tracingMod.Interaction], 
    scala.Unit
  ]
  
  type PropsWithChildren[P] = P with com.olvind.mui.react.anon.Children
  
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (com.olvind.mui.react.mod.PropsWithoutRef[P] with com.olvind.mui.react.anon.`1`)
  
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (com.olvind.mui.std.Pick[
    P, 
    com.olvind.mui.std.Exclude[/* keyof P */ java.lang.String, com.olvind.mui.react.reactStrings.ref]
  ])
  
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = com.olvind.mui.react.mod.ProviderExoticComponent[com.olvind.mui.react.mod.ProviderProps[T]]
  
  type ReactEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactEventFrom[T with org.scalajs.dom.Element]]
  
  type ReactManagedAttributes[C, P] = P | (com.olvind.mui.react.mod.Defaultize[
    (com.olvind.mui.react.mod.MergePropTypes[P, com.olvind.mui.propTypes.mod.InferProps[scala.Any]]) | P, 
    scala.Any
  ]) | (com.olvind.mui.react.mod.MergePropTypes[P, com.olvind.mui.propTypes.mod.InferProps[scala.Any]])
  
  type Ref[T] = japgolly.scalajs.react.facade.React.RefFn[T] | japgolly.scalajs.react.facade.React.RefHandle[T] | scala.Null
  
  //
  // React Hooks
  // ----------------------------------------------------------------------
  // based on the code in https://github.com/facebook/react/pull/13968
  // Unlike the class component setState, the updates are not allowed to be partial
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
  
  type TouchEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactTouchEventFrom[T with org.scalajs.dom.Element]]
  
  type TransitionEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactTransitionEventFrom[T with org.scalajs.dom.Element]]
  
  type UIEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactUIEventFrom[T with org.scalajs.dom.Element]]
  
  type ValidationMap[T] = com.olvind.mui.propTypes.mod.ValidationMap[T]
  
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? react.react.Validator<T[K] | null | undefined> : undefined extends T[K]? react.react.Validator<T[K] | null | undefined> : react.react.Validator<T[K]>}
    */ com.olvind.mui.react.reactStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[scala.Any]
  
  type WheelEventHandler[T] = com.olvind.mui.react.mod.EventHandler[japgolly.scalajs.react.ReactWheelEventFrom[T with org.scalajs.dom.Element]]
}
