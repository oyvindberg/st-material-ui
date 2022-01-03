package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setRefMod {
  
  @JSImport("@mui/material/utils/setRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: MutableRefObject[T | Null]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: MutableRefObject[T | Null], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def default[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
