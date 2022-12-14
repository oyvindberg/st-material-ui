package com.olvind.mui.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationPlayState = "finished" | "idle" | "paused" | "running"

type CompositeOperation = "accumulate" | "add" | "replace"

type CompositeOperationOrAuto = "accumulate" | "add" | "auto" | "replace"

/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[java.lang.String]]

type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? never : T
  }}}
  */
type Exclude[T, U] = T

/**
  * Extract from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? T : never
  }}}
  */
type Extract[T, U] = T

type FillMode = "auto" | "backwards" | "both" | "forwards" | "none"

type FullscreenNavigationUI = "auto" | "hide" | "show"

type InsertPosition = "beforebegin" | "afterbegin" | "beforeend" | "afterend"

type IterationCompositeOperation = "accumulate" | "replace"

type IteratorResult[T, TReturn] = IteratorYieldResult[T] | IteratorReturnResult[TReturn]

/**
  * Exclude null and undefined from T
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends null | undefined ? never : T
  }}}
  */
type NonNullable[T] = T

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null

type OnErrorEventHandlerNonNull = js.Function5[
/* event */ org.scalajs.dom.Event | java.lang.String, 
/* source */ js.UndefOr[java.lang.String], 
/* lineno */ js.UndefOr[Double], 
/* colno */ js.UndefOr[Double], 
/* error */ js.UndefOr[js.Error], 
Any]

/**
  * Make all properties in T optional
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Partial[T] = T

/**
  * From T, pick a set of properties whose keys are in the union K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = T

type PlaybackDirection = "alternate" | "alternate-reverse" | "normal" | "reverse"

/**
  * Construct a type with a set of properties K of type T
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation throws away the known field names. 
  * TS definition: {{{
  {[ P in K ]: T}
  }}}
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = StringDictionary[T]

type ScrollBehavior = "auto" | "smooth"

type ScrollLogicalPosition = "center" | "end" | "nearest" | "start"

type ShadowRootMode = "closed" | "open"
