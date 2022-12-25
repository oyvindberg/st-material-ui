package com.olvind.mui.clsx

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ClassDictionary = Record[String, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ClassValue = clsx.clsx.ClassArray | clsx.clsx.ClassDictionary | string | number | null | boolean | undefined
  }}}
  to avoid circular code involving: 
  - clsx.clsx.ClassArray
  - clsx.clsx.ClassValue
  */
  type ClassValue = js.UndefOr[Any | ClassDictionary | String | Double | Null | Boolean]
}
