package com.example.footballapp.data

import com.example.footballapp.data.db.DbHelper
import com.example.footballapp.data.network.ApiHelper
import com.example.footballapp.data.prefs.PrefsHelper

interface DataManager : DbHelper, ApiHelper, PrefsHelper