package com.olvind.mui.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[java.lang.String]]

type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
type Exclude[T, U] = T

/**
  * Extract from T those types that are assignable to U
  */
type Extract[T, U] = T

/**
  * Obtain the return type of a constructor function type
  */
type InstanceType[T /* <: Instantiable1[/* args */ Any, Any] */] = Any

/**
  * Exclude null and undefined from T
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
type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ com.olvind.mui.std.stdStrings.Partial & TopLevel[T]

/**
  * From T, pick a set of properties whose keys are in the union K
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  */ com.olvind.mui.std.stdStrings.Pick & TopLevel[T]

type PropertyKey = java.lang.String | Double | js.Symbol

/**
  * Construct a type with a set of properties K of type T
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = StringDictionary[T]

/**
  * Obtain the return type of a function type
  */
type ReturnType[T /* <: js.Function1[/* args */ Any, Any] */] = Any
